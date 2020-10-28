package com.gaj.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.gaj.entity.MetaQsdw;
import com.gaj.entity.SyqDlfx;
import com.gaj.service.MetaQsdwService;
import com.gaj.service.SyqDlfxService;
import com.gaj.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Jan
 * @since 2020-10-27
 */
@RestController
@RequestMapping("/syq-dlfx")
public class SyqDlfxController {

    @Autowired
    private MetaQsdwService metaQsdwService;
    @Autowired
    private SyqDlfxService syqDlfxService;

    @GetMapping
    private R getTree() {
        // 匹配结果
        List<SyqDlfx> syqDlfxList = new ArrayList<>();
        // 匹配结果
        List<MetaQsdw> metaQsdwList = new ArrayList<>();
        // 获取所有SyqDlfx列表
        List<SyqDlfx> syqDlfxes = syqDlfxService.list();
        // 获取所有MetaQsdw列表
        List<MetaQsdw> metaQsdws = metaQsdwService.list();

        // 相当于select * from syq_dlfx a join meta_qsdw b on a.code = b.dm
        syqDlfxes.forEach(syqDlfx -> metaQsdws.forEach(metaQsdw -> {
            if (syqDlfx.getCode().equals(metaQsdw.getDm())) {
                syqDlfxList.add(syqDlfx);
                metaQsdwList.add(metaQsdw);
            }
        }));

        // 去重，得到MetaQsdw
        Set<MetaQsdw> metaQsdwSet = metaQsdwList
                .stream()
                .filter(Objects::nonNull)
                .map(metaQsdw -> metaQsdwService.getOne(new LambdaQueryWrapper<MetaQsdw>().eq(MetaQsdw::getDm, metaQsdw.getSsxzqdm())))
                .collect(Collectors.toSet());

        // 装入children
        metaQsdwSet.forEach(metaQsdw -> syqDlfxList
                .stream()
                .filter(syqDlfx -> syqDlfx.getXzqh().contains(metaQsdw.getQc()))
                .forEach(metaQsdw::add));

        return R.ok(metaQsdwSet);
    }

}


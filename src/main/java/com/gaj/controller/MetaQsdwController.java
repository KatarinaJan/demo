package com.gaj.controller;


import com.gaj.entity.MetaQsdw;
import com.gaj.service.MetaQsdwService;
import com.gaj.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Jan
 * @since 2020-10-27
 */
@RestController
@RequestMapping("/meta-qsdw")
public class MetaQsdwController {

    @Autowired
    private MetaQsdwService metaQsdwService;

    @GetMapping
    public R getTree() {
        // 获取到qsdw的所有数据
        List<MetaQsdw> metaQsdwList = metaQsdwService.list();
        for (MetaQsdw metaQsdw : metaQsdwList) {
            for (MetaQsdw qsdw : metaQsdwList) {
                if (metaQsdw.getDm().equals(qsdw.getSsxzqdm())) {
                    metaQsdw.add(qsdw);
                }
            }
        }
        return R.ok(metaQsdwList);
    }

}
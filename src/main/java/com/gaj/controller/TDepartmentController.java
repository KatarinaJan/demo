package com.gaj.controller;


import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.gaj.entity.TDepartment;
import com.gaj.service.TDepartmentService;
import com.gaj.util.R;
import io.swagger.annotations.*;
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
 * @since 2020-09-02
 */
@Api(tags = "部门管理")
@RestController
@RequestMapping("/t-department")
public class TDepartmentController {

    @Autowired
    private TDepartmentService departmentService;

    @ApiOperation("查询部门列表")
    @GetMapping
    public R selectList() {
        List<TDepartment> list = departmentService.list(Wrappers.emptyWrapper());
        if (null == list) {
            return R.failed("很抱歉，没有获取到数据..");
        }
        return R.ok(list,"数据获取成功！");
    }

}


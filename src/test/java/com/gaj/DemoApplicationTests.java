package com.gaj;

import com.gaj.entity.TDepartment;
import com.gaj.mapper.TDepartmentMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class DemoApplicationTests {

    @Autowired
    private TDepartmentMapper departmentMapper;

    @Test
    public void testSelectList() {
        System.out.println("----- selectAll method test ------");
        List<TDepartment> tDepartments = departmentMapper.selectList(null);
        tDepartments.forEach(System.out::println);
    }

}

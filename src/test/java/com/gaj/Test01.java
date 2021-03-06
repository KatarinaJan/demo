package com.gaj;

import com.gaj.exception.CustomException;
import com.gaj.util.R;
import org.junit.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: demo
 * @Describe: 描述
 * @Author: Jan
 * @Date: 2020-09-02 22:19
 */
public class Test01 {

    @SuppressWarnings("NumericOverflow")
    @Test
    public void test01() {
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            throw new CustomException(20000,"执行了自定义异常处理..");
        } finally {
            System.out.println("执行了test01");
        }
    }

}

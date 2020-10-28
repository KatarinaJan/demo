package com.gaj.test;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.DatePattern;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gaj.entity.MetaQsdw;
import org.junit.Test;

/**
 * @Project: demo
 * @Describe: 描述
 * @Author: Jan
 * @Date: 2020-10-10 17:50
 */
public class Test01 {

    @Test
    public void test01() {
        System.out.println(DateUtil.format(new Date(), DatePattern.NORM_DATETIME_MS_PATTERN));
    }

    @Test
    public void test02() {
        List<MetaQsdw> list = new ArrayList<>();
        MetaQsdw metaQsdw1 = new MetaQsdw(1,	"36",	"江西省",	"江西省",	1,	"00", new ArrayList<>(), null);
        MetaQsdw metaQsdw2 = new MetaQsdw(2,	"3606",	"鹰潭市",	"鹰潭市",	2,	"36", new ArrayList<>(), null);
        MetaQsdw metaQsdw3 = new MetaQsdw(3,	"360622",	"余江县",	"余江县",	3,	"3606", new ArrayList<>(), null);
        MetaQsdw metaQsdw4 = new MetaQsdw(4,	"360622100",	"邓埠镇",	"邓埠镇",	4,	"360622", new ArrayList<>(), null);
        MetaQsdw metaQsdw5 = new MetaQsdw(5,	"360622100200",	"邓埠镇三宋村委会",	"邓埠镇三宋村委会",	5,	"360622100", new ArrayList<>(), null);
        MetaQsdw metaQsdw6 = new MetaQsdw(6,	"360622100201",	"邓埠镇三宋村委会1",	"邓埠镇三宋村委会1",	5,	"360622100", new ArrayList<>(), null);

        list.add(metaQsdw1);
        list.add(metaQsdw2);
        list.add(metaQsdw3);
        list.add(metaQsdw4);
        list.add(metaQsdw5);
        list.add(metaQsdw6);

        for (MetaQsdw metaQsdw : list) {
            for (MetaQsdw qsdw : list) {
                if (metaQsdw.getDm().equals(qsdw.getSsxzqdm())) {
                    metaQsdw.add(qsdw);
                }
            }
        }

        System.out.println(list);


    }


}

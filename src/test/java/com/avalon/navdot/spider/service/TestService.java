package com.avalon.navdot.spider.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @version 1.0
 * @author: 侯铭健
 * @email mingjian_hou@kingdee.com
 * @time 2017/3/13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestService {

    @Autowired
    private TestSave testSave;

    @Test
    public void test() {
        testSave.save();
    }
}

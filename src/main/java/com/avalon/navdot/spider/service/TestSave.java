package com.avalon.navdot.spider.service;

import com.avalon.navdot.persistence.dao.KeyWordDao;
import com.avalon.navdot.persistence.po.KeyWordPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @author: 侯铭健
 * @email mingjian_hou@kingdee.com
 * @time 2017/3/13
 */
@Component
public class TestSave {

    @Autowired
    private KeyWordDao keyWordDao;

    public void save() {
        KeyWordPO keyWordPO = new KeyWordPO();
        keyWordPO.setContent("1");
        keyWordPO.setId(1L);
        keyWordPO.setIsUse(1);
        keyWordPO.setType("1");

        keyWordDao.insert(keyWordPO);
    }
}

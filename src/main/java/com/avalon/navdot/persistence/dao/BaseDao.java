package com.avalon.navdot.persistence.dao;

import com.avalon.navdot.persistence.po.KeyWordPO;

/**
 * @version 1.0
 * @author: 侯铭健
 * @email mingjian_hou@kingdee.com
 * @time 2017/3/13
 */
public interface BaseDao {

    int deleteByPrimaryKey(Long id);

    int insert(KeyWordPO record);

    int insertSelective(KeyWordPO record);

    KeyWordPO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(KeyWordPO record);

    int updateByPrimaryKey(KeyWordPO record);
}

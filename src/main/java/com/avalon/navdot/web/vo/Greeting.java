package com.avalon.navdot.web.vo;

/**
 * 测试
 * @version 1.0
 * @author: 侯铭健
 * @email mingjian_hou@kingdee.com
 * @time 2017/3/13
 */
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}

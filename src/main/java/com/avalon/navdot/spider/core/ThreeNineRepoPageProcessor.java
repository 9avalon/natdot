package com.avalon.navdot.spider.core;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.ArrayList;
import java.util.List;

/**
 * 39健康网
 *
 * Created by Avalon on 2017/2/19.
 */
public class ThreeNineRepoPageProcessor implements PageProcessor {

    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000);

    @Override
    public void process(Page page) {
        List<String> symptomNameList = page.getHtml().xpath("//div[@id='res_subtab_1']/div/dl/dt/h3/a/@title").all();
        page.putField("symptomName", symptomNameList);
        page.addTargetRequests(page.getHtml().links().regex("(http://jbk.39.net/bw_t2_p[0-9]\\d*?#ps)").all());
    }

    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        Spider.create(new ThreeNineRepoPageProcessor())
                .addUrl("http://jbk.39.net/bw_t2")
                .thread(1)
                .run();
    }

}

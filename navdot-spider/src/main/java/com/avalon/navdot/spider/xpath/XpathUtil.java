package com.avalon.navdot.spider.xpath;


import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import org.jsoup.nodes.Element;

import java.io.*;
import java.util.List;

/**
 * xpath 测试工具
 *
 * @version 1.0
 * @author: 侯铭健
 * @email mingjian_hou@kingdee.com
 * @time 2017/3/12
 */
public class XpathUtil {

    public static void main(String[] args) throws XpathSyntaxErrorException {
        // //*[@id="res_subtab_1"]/div[1]/dl/dt/h3/a
        String xpath = "//a/@href";
        String doc = readCode().replaceAll("\n", "");
        JXDocument jxDocument = new JXDocument(doc);
        List<Object> rs = jxDocument.sel(xpath);
        for (Object o : rs) {
            if (o instanceof Element) {
                int index = ((Element) o).siblingIndex();
                System.out.println(index);
            }
            System.out.println(o.toString());
        }
    }

    /**
     * 读取验证码文件，junit不能scanner
     */
    public static String readCode() {
        File file = new File("C:\\Users\\Avalon\\Desktop\\test.txt");
        Reader reader = null;
        StringBuilder sb = new StringBuilder();
        try {
            System.out.println("以字符为单位读取文件内容，一次读一个字节：");
            // 一次读一个字符
            reader = new InputStreamReader(new FileInputStream(file), "GBK");
            int tempchar;
            while ((tempchar = reader.read()) != -1) {
                // 对于windows下，\r\n这两个字符在一起时，表示一个换行。
                // 但如果这两个字符分开显示时，会换两次行。
                // 因此，屏蔽掉\r，或者屏蔽\n。否则，将会多出很多空行。
                if (((char) tempchar) != '\r') {
                    sb.append((char) tempchar);
                }
            }
            reader.close();
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

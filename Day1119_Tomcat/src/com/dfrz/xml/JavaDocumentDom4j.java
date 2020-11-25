package com.dfrz.xml;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.List;

public class JavaDocumentDom4j {

    //1.创建SaxReader对象 这个对象用于读取xml文件 并创建Document对象
    @Test
    public void getDocument() throws DocumentException {//方法声明也称为方法签名
        //要创建一个Document对象 需要先创建一个SAXReader对象
        SAXReader reader = new SAXReader();
        //Document对象用于读取xml文件 然后返回一个Document
        Document document = reader.read("C:\\Users\\WuLiangHang\\IdeaProjects\\JavaWeb02\\Day1119_Tomcat\\src\\goods.xml");
        //打印到控制台 看看是否创建成功
        System.out.println(document);
    }

    //遍历标签 获取标签中所有的内容 重点
    // 注解 仅在测试的时候使用 如果测试完 请务必删除
    @Test
    public void readXML1() throws DocumentException {
        //读取xml文件内容 分四步
        /*
        1.	通过SaxReader加载xml文件创建Document对象
        2.	通过Document对象获取xml根元素对象
        3.	通过根元素.elements(标签名);可以返回一个集合 这个集合当中存放着所有指定标签名的元素对象
        4.	找到想要修改、删除的子元素 进行相应的操作
         */
        //1.通过SaxReader加载xml文件创建Document对象
        SAXReader reader = new SAXReader();
        Document document = reader.read("C:\\Users\\WuLiangHang\\IdeaProjects\\JavaWeb02\\Day1119_Tomcat\\src\\goods.xml");
        //2.通过Document对象获取xml根元素对象
        Element root = document.getRootElement();
        //打印测试
//        System.out.println(root); //[Element: <goods attributes: []/>]
        System.out.println(root.asXML());//将当前元素转换成String对象
        System.out.println("========String对象输出结束======");
        //3.通过根元素对象 获取所有的good标签对象
        //Element.elements(标签名) 可以拿到 当前元素下的指定子元素集合
        List<Element> goods = root.elements("good");
//        System.out.println(goods.get(0).asXML());
        //4.遍历每个good标签对象 然后获取到good标签对象内的每一个元素
        for (Element good :
                goods) {
            //测试
//            System.out.println(good.asXML());
            //拿到good标签下的name元素对象
            Element nameElement = good.element("name");
            //拿到firm元素对象
            Element firmElement = good.element("firm");
            //拿到price元素对象
            Element priceElement = good.element("price");
            //通过getText()方法 拿到起始标签和结束标签之间的文本内容
            System.out.println("商品名为" + nameElement.getText() + ",价格为" + priceElement.getText() + ",厂家是" + firmElement.getText());
        }
    }
}

package lesson14_Jsoup选择器查询;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Demo01 {

  public static void main (String[] args) throws IOException{
    // 2.1 获取student.xml的path
    String path = Demo01.class.getClassLoader().getResource("student.xml").getPath();
    // parse重载方法一： 传入File对象，返回document对象
    // 2.2 析xml文档，加载文档金内存，获取dom树--->Document
    Document document = Jsoup.parse(new File(path), "utf-8");

    // 3/ 查询name标签
    /**
     *  div{
     *
     *  }
     */
    
    // 查询name标签
    Elements elements = document.select("name");
    System.out.println(elements);
    System.out.println("----");

    // 查询id值为 itcast的元素
    Elements elements2 = document.select("#itcast");
  
    System.out.println(elements2);
    System.out.println("--222-");

    // 获取student标签，number属性值为heima_0001的标签
    // <student id="id2" number="heima_0001">
    Elements elements3 = document.select("student[number='heima_0001']");
    System.out.println(elements3);
    System.out.println("3333333333333333");

    // 获取student标签并且number属性值为heima_0001的sex子标签
    Elements element4 = document.select("student[number='heima_0001'] > sex");
    System.out.println(element4);
  }
}


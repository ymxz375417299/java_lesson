package lesson12_Elements对象;

import java.io.File;
import java.io.IOException;

import javax.lang.model.element.Element;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Demo01 {
  public static void main(String[] args) throws IOException {

    // ### 2. Document：文档对象。代表内存中的dom树
    // * 获取Element对象
    //  * getElementById(String id)：根据id属性值获取唯一的element对象
    //    * getElementsByTag(String tagName)：根据标签名称获取元素对象集合
    //      * getElementsByAttribute(String key)：根据属性名称获取元素对象集合
    //        * getElementsByAttributeValue(String key, String value)：根据对应的属性名和属性值获取元素对象集合

    // 2.1 获取student.xml的path
    String path = Demo01.class.getClassLoader().getResource("student.xml").getPath();
    // parse重载方法一： 传入File对象，返回document对象
    // 2.2 析xml文档，加载文档金内存，获取dom树--->Document
    Document document = Jsoup.parse(new File(path), "utf-8");
    System.out.println(document);
    System.out.println("---------");

    // 3. 获取元素对象
    // 3.1 回去所有student对象
    Elements elements = document.getElementsByTag("student");
    System.out.println(elements);
    System.out.println("-------");

    // 3.2 获取属性名为id的元素对象们
    Elements elements1 = document.getElementsByAttribute("id");
    System.out.println(elements1);
    System.out.println("----");

    // 3.3 获取 指定属性名,指定值为itcast的元素组
    //        * getElementsByAttributeValue(String key, String value)：根据对应的属性名和属性值获取元素对象集合
    Elements elements2 = document.getElementsByAttributeValue("number", "10086");
    System.out.println(elements2);
    System.out.println("-2222222222--");

    // 3.3 根据ID获取单个对象
    // 注意是单个对象
    //  * getElementById(String id)：根据id属性值获取唯一的element对象
    Element itcast = document.getElementById("itcast");
    System.out.println(itcast);

  }
}

package lesson13_Element对象;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Demo01 {

  public static void main (String[] args) throws IOException{
    /**
     * ### 3 Elements：元素Element对象的集合。可以当做 ArrayList<Element>来使用
     * ### 4 Element：元素对象
     * 1 获取子元素对象
     *  * getElementById​(String id)：根据id属性值获取唯一的element对象
     *    * getElementsByTag​(String tagName)：根据标签名称获取元素对象集合
     *      * getElementsByAttribute​(String key)：根据属性名称获取元素对象集合
     *        * getElementsByAttributeValue​(String key, String value)：根据对应的属性名和属性值获取元素对象集合
     *
     *        2 获取属性值
     *          * String attr(String key)：根据属性名称获取属性值
     *          3 获取文本内容
     *            * String text():获取文本内容
     *              * String html():获取标签体内（innerHTML）的所有内容(包括字标签的字符串内容)
     */
    // 2.1 获取student.xml的path
    String path = Demo01.class.getClassLoader().getResource("student.xml").getPath();
    // parse重载方法一： 传入File对象，返回document对象
    // 2.2 析xml文档，加载文档金内存，获取dom树--->Document
    Document document = Jsoup.parse(new File(path), "utf-8");

    // 获取Document对象获取name标签，获取所有的name标签，本案例可以获取2个
    Elements elements = document.getElementsByTag("name");
    System.out.println(elements.size());
    System.out.println("----");

    // 获取Element对象（一个）
    Element element_student = document.getElementsByTag("student").get(0);
    // 通过Elementn对象获取子标签对象
    Elements ele_name = element_student.getElementsByTag("name");
    System.out.println(ele_name.size());

    // 获取student对象的属性值
    // String attr(String key)：根据属性名称获取属性值
    // 传入的参数可以无视大小写
    String number = element_student.attr("number");
    // System.out.println(number);

    // 获取文本内容
    String text = ele_name.text();
     // String html():获取标签体内（innerHTML）的所有内容(包括字标签的字符串内容)
    String html = ele_name.html();
    System.out.println(text);
    System.out.println(html);
    
  }
}


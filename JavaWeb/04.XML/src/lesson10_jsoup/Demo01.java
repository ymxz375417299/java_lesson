package lesson10_jsoup;

import java.io.File;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/** Jsoup快速入门 */
public class Demo01 {
  public static void main(String[] args) throws IOException {
    // 2. 获取Document对象，根据
    // 2.1 获取student.xml的path
    // String path = Demo01.class.getClassLoader().getResource("student.xml").getPath();
    // System.out.println("student.xml");
    // 2.. 解析xml文档，加载文档进内存，获取dom树--> Document

    File file = new File("/home/rock/java_lesson/JavaWeb/04.XML/src/student.xml");
    Document document = Jsoup.parse(file, "utf-8");
    // 3. 获取元素对象Element
    Elements elements = document.getElementsByTag("name");
    System.out.println(elements.size());
    // 3.1获取第一个name的Element对象
    Element element = elements.get(0);
    // 3.2 获取数据
    String name = element.text();
    System.out.println(name);
  }
}

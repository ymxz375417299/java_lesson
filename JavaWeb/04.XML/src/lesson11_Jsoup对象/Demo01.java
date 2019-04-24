package lesson11_Jsoup对象;

import java.io.File;
import jso




public class Demo01 {

  public static void main (String[] args) {
    // 2.1 获取student.xml的path
    File file = new File("/home/rock/java_lesson/JavaWeb/04.XML/src/student.xml");
    // 2.2 解析xml文档，加载文档金内存，获取dom树--->Document
    Document document = Jsoup.parse(file, "utf-8");
    System.out.println(document);



  }
}


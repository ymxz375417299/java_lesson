package lesson11_Jsoup对象;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Demo01 {

  public static void main(String[] args) throws IOException {
    // 2.1 获取student.xml的path
    String path = Demo01.class.getClassLoader().getResource("student.xml").getPath();

    // parse重载方法一： 传入File对象，返回document对象
    // 2.2 析xml文档，加载文档金内存，获取dom树--->Document
    Document document = Jsoup.parse(new File(path), "utf-8");
    // document.toString() 返回xml的字符串
    // System.out.println(document);

    // parse 重载方法二， 传入字符串
    String str =
        "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n"
            + "\n"
            + "<students>\n"
            + "\t<student number=\"heima_0001\">\n"
            + "\t\t<name>tom</name>\n"
            + "\t\t<age>18</age>\n"
            + "\t\t<sex>male</sex>\n"
            + "\t</student>\n"
            + "\t<student number=\"heima_0002\">\n"
            + "\t\t<name>jack</name>\n"
            + "\t\t<age>18</age>\n"
            + "\t\t<sex>female</sex>\n"
            + "\t</student>\n"
            + "\n"
            + "</students>";
    Document document2 = Jsoup.parse(str);
    // System.out.println(document2);

    // parse 重载方法三 parse(URL url, int timeoutMillis)：通过网络路径获取指定的html或xml的文档对象)
    // URL 统一资源定位符，地址
    // 返回html 和xml的document文档对象 可以用来做爬虫
    URL url = new URL("http://i.ashvsash.com/2019/03/18906"); // 代表网络中的一个资源定位符
    Document document3 = Jsoup.parse(url, 1000);
    System.out.println(document3); //
  }
}

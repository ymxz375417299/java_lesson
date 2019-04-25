package lesson15_Jsoup_Xpath查询;

import java.io.File;
import java.io.IOException;
import java.util.List;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Demo01 {
  public static void main (String[] args) throws IOException, XpathSyntaxErrorException{
    // 2.1 获取student.xml的path
    String path = Demo01.class.getClassLoader().getResource("student.xml").getPath();
    // parse重载方法一： 传入File对象，返回document对象
    // 2.2 析xml文档，加载文档金内存，获取dom树--->Document
    Document document = Jsoup.parse(new File(path), "utf-8");
    

    // 3 根据doucment对象，创建JXDocument对象
    JXDocument jxDocument = new JXDocument(document);

    // 4. 结合xpath语法查document询
    // 4.1 查询所有的student标签
    List<JXNode> jxNodes = jxDocument.selN("//student");
    // 增强for循环
    for (JXNode jxNode : jxNodes){
      // 转成Element对象
      Element element = jxNode.getElement();
      System.out.println(element.text());
    }
    System.out.println("----------");

    // 4.2 查询所有student标签下的name标签
    List<JXNode> jxNodes2 = jxDocument.selN("//student/name");
    for (JXNode jxNode : jxNodes2){
      System.out.println(jxNode);
    }
    System.out.println("--------");

    // 4.3 查询student标签下带有id属性的name标签
    List<JXNode> jxNodes3 = jxDocument.selN("//student/name[@id]");
    for (JXNode jxNode : jxNodes3){
      System.out.println(jxNode);
    }
    System.out.println("-------");

    // 4.4 查询student标签下带有id属性的name标签，并且id属性值为itcast
    List<JXNode> jxNodes4 = jxDocument.selN("//student/name[@id='itcast']");
    for (JXNode jxNode : jxNodes4){
      System.out.println(jxNode);
    }
    System.out.println("-------");

  }

}


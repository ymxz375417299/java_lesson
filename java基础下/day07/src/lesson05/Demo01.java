package lesson05;

import java.io.IOException;

public class Demo01 {

  public static void main (String[] args) throws IOException{
    
    /**
     * ![image](004DD93C768845278B16A34CCF644EF3)
     *
     *
     * # Runtime类
     * ### Runtime类是一个单例类
     * ###  没个Java应用程序 都有一个Runtime类实例，使应用程序能够与其运行环境相链接，可以通过getRuntime 放获取当前运行时
     * ### 案例： 自动关机
     * Runtime r = Runtime.getRuntime();
     * r.exec("shutdown -s -t 300") // 关机
     * r.exec("shutdown -a ") // 取消关机
     */
    Runtime r = Runtime.getRuntime(); // 获取单例
    // r.exec("sudo shutdown -h -s 300");
    r.exec("shutdown -a");

  }
}


package lesson13;

public class Demo03 {

  public static void main (String[] args) {
    // - public static long currentTimeMillis() // 从1970年1月1日到现在的时间，时间单位毫秒，返回long类型)
    // 1秒=1000毫秒

    // 毫秒
    long time = System.currentTimeMillis(); // 时间戳
    System.out.println(time);

    // 秒
    System.out.println(time / 1000);

    // 分钟
    System.out.println(time / 1000/ 60);
    
    // 小时
    System.out.println(time / 1000/ 60 / 60);

    // 天
    System.out.println(time / 1000/ 60 / 60 / 60);

    // 年
    System.out.println(time / 1000/ 60 / 60 / 60 / 360);

  }
}


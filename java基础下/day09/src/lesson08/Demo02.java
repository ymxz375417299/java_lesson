package lesson08;

public class Demo02 {
  public static void main (String[] args) {
    // 使用正则表达式检测是否合法QQ号码
    // 校验qq号码
    // 1. 必须5-15数字
    // 2： 0不能开头
    // 必须都是数字

    // 1. qq的正则
    // 正则表达式
    String regex = "^[1-9]\\d{4,14}$";
    // String 提供了 使用正则表达公司的方法
    // 返回值为boolean
    // Str.matches(regex)  
    System.out.println("10222".matches(regex));
    System.out.println("0222".matches(regex));
    System.out.println("102q22".matches(regex));
    System.out.println("10212222222222".matches(regex));
    System.out.println("1022122222222222".matches(regex));
    
  }

}


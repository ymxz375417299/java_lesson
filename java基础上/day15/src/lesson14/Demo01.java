package lesson14;

public class Demo01 {
  public static void main (String[] args) {
    // 案例： 字符串的遍历

    String s = "Gosling";
    int len = s.length(); //字符串的长度

    for (int i = 0; i < len; i++){
      System.out.println(s.charAt(i));
    }

    // 面试题： 数组有没有length方法， String中有没有length属性
    // 数组是没有legth方法， 只有length属性 因为数组的代码是arrlength ,没有括号，说明是属性
    // 自负惨的lenth是方法，而不是属性
    int[] arr = {1, 2, 3, 4, 5};
    System.out.println(arr.length);
  }

}


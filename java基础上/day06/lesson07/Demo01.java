
public class Demo01 {

  public static void main(String[] args) {
    //静态初始化格式
    //格式：数据类型[] 数组名 = new 数据类型[]{元素1， 元素2， 元素3};
    //简化格式： 数据类型[] 数据名 = {元素1， 元素2， 元素3};
    //
    //1. 把3个值分别放在不同的变量
    int a =12;
    int b = 11;
    int c = 20;
    // 2. 把3个值放在一个数组
    int[] arr = new int[3];// 【动态初始化， 里面的每隔一元素都赋值了2次， 默认先初始化值0一次】
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;

    // 3. 静态初始化
    // 数据类型[] 数组名 = new 数据类型[] {元素1， 元素2， 元素 3};
    int[] arr2 = new int[]{12, 11, 10};
    // 简写
    int[] arr3 = {12, 13, 14};

    // 注意：一般 不会再new int[5] 写一个数组的个数，静止动静结合的写法
    // int[] arr4 = new int[4]{12, 11, 10};

  }

}


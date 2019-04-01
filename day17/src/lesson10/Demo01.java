package lesson10;

// 考点： 
// 对自动装箱的理解
public class Demo01 {

  public static void main (String[] args) {
    // 看程序写结果
    // 1 
    Integer i1 = new Integer(97);
    Integer i2 = new Integer(97);
    System.out.println(i1 == i2); // false,因为new的是不同的内存地址，== 是对比内存地址，
    System.out.println(i1.equals(i2)); // true, 因为Integer的equal看源码是比对的值，不是内存地址
    System.out.println("-------");

    // 2
    Integer i3 = new Integer(197);
    Integer i4 = new Integer(197);
    System.out.println(i3==i4); // false
    System.out.println(i3.equals(i4)); //true
    System.out.println("-------");

    // 3
    // 结论： 自动装箱，如果值一样，地址也一样
    Integer i5 = 127; //自动装箱
    Integer i6 = 127; //自动装箱
    System.out.println(i5 == i6); // true
    // 结论： 自动装箱，如果值一样，地址也一样
    System.out.println(i5.equals(i6)); //true


    // 4 
    Integer i7 = 128;
    Integer i8 = 128;
    System.out.println(i7 == i8); // false 为什么？ 和第三题不同
    System.out.println(i7.equals(i8));
    System.out.println("-------");


    // 结论： 
    // # 结论
    // 自动装箱，范围在-128 ~ 127 （即2的8次方，256值正负值各一半），如果值一样，那内存地址一样
    // 超过这个范围，就算值一样，内存地址也会不同





    
  }
}


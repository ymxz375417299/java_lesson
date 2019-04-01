package lesson13;

import java.util.Arrays;
public class Demo04 {
  public static void main (String[] args) {
    //### - public static void arraycooy(Object src, int srcPos, Object dest, int destPos, int length) // 数组的拷贝)
    //
    //#### 参数
    //src - > source  源  
    //pos - > positon 位置  
    //dest - > destination 目标  
    //
    //- Object src: 源对象
    //- int srcpos: 源对象位置
    //- Object dest: 目标对象
    //- int destPost: 模板位置
    //- int length: 长度

    // 把arr1的元素部分拷贝到arr2里
    int[] arr1 = {23, 21, 2, 18, 49};
    int[] arr2 = new int[3]; // 创建容量为3的数字
    System.out.println(Arrays.toString(arr2)); //  输出为[0, 0, 0 ] 默认值为0

    System.arraycopy(arr1, 1, arr2, 0, 3); // 把arr1数组的，索引值1，开始拷贝到arr2,的索引值2，长度为3
    System.out.println(Arrays.toString(arr2));
    // 输出结果为{21,2，18}

  }

}


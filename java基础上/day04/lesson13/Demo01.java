
public class Demo01 {

  public static void main(String[] args) {
    //控制台输出100到999所有的”水仙花数“
    for(int i=100; i<=999; i++){
      //求100到999的水仙花
      //1. 求百位数
      int bw = i / 100;
      //2. 求十位数
      int sw = i % 100 /10;
      //3. 求个位数
      int gw = i % 10;
      //4. 求三个数的立方和
      int sum = bw * bw * bw + sw * sw * sw + gw * gw * gw;
      if(sum == i){
        System.out.println(i);
      }
    
    }
    

  }

}


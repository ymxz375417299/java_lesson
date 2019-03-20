/*
   另一种U型你换控制语句是continue关键词
   一旦执行，立刻跳过当前循环剩余内容，马上开始下一个循环
*/

public class Demo15Continue{
  public static void main (String[] args) {
    for(int i = 1; i <= 10; i++){
      if(i == 4){ // 如果当前是第四层
        continue;

      
      }
      System.out.println("Hello" + i);
    }
  }
}

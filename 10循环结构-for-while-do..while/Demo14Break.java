
public class Demo14Break {

  public static void main(String[] args) {
    for(int i = 1; i <= 10; i++){
      if(i == 4 ){//如果当前是第四次
        //直接打断循环
        break;
      
      }
      System.out.println("hellow" + i);
    }

  }

}


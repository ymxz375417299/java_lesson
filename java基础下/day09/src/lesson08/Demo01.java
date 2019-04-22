package lesson08;

public class Demo01 {

  public static void main (String[] args) {
    // 校验qq号码
    // 1. 必须5-15数字
    // 2： 0不能开头
    // 必须都是数字

    String qq = "10a1030";
    // 旧的麻烦实现方式
    // 1. 要求必须5~15位数
    if (qq.length() >= 5 && qq.length() <= 15){
      System.out.println("QQ 长度合法");
      if ( !qq.startsWith("0")){
        // 3. 是否有非数字字符
        // 遍历
        for (int i = 0; i < qq.length(); i++){
          char ch = qq.charAt(i);
          if (!(ch >= '0' && ch <= '9')){
            System.out.println("不允许使用字母，或特殊符号");
            return;
          }
          
        }
        System.out.println("恭喜，QQ格式合法");
      }else{
        System.out.println("QQ 不能以0开头");
      }
    }else{
      System.out.println("QQ 长度非法");
    }

    
  }
}

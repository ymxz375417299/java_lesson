
public class Demo01 {

  public static void main(String[] args) {
    //### 04.超人案例(深入理解多态-==隐藏-低调-伪装==)讲解
    //
    //- 超人去美国找某某集团的老总谈生意
    //- 超人在别人面前，如果不说自己是 超人，在别人面前表现的就是普通人
    //- 老总以为是谈小生意的， 但实际是谈大生意
    //- 老总以为他不会飞，实际上他会飞去救人)
    
    // 父类指向子类对象（多台）
    Person p = new SupperMan(); // 左边是普通人，而实际是超人的类。  //编译看左边，运行看右边，所以实际是超人的方法 // 前提必须方法重写，所以在父类也加个fly方法
    p.fly();
    
  }

}

//普通人
class Person{
  public void walk(){
    System.out.println("走。。");
  }

  public void fly(){
    System.out.println("普通人，不会飞");
  }
}


class SupperMan extends Person{
  public void fly(){
    System.out.println("超人： 飞~~~");
  }
  
}

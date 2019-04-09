
public class Demo02 {

  public static void main(String[] args) {
    // 3. 接口与接口
    //    继承关系，可以单继承，也可以多继承

  }

}

interface  CInterface{// 命名不能叫AInterface ,接口也是， 因为同一个包文件夹不能重名
  public void say1();
}


interface DInterface{
  public void say2();
}


//E接口继承C接口
// interface EInterface extends CInterface{ // 接口可以单继承 
  // public void say3();
//
// }

//E接口继承C接口 和D接口，多继承
interface EInterface extends CInterface, DInterface{ // 接口可以多继承
  public void say3();

}


class E implements EInterface{

  // E这个实现类。需要实现三个个say()方法，因为继承了E接口
}




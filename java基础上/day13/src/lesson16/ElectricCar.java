package lesson16;

import com.baidu.test.Car;

// 本类是继承com.baidu.test的Car
public class ElectricCar extends Car{
  public void test3(){
    // 子类可以调用不同包下的父类的protected的方法
    test2();
  }

}


package lesson16;

import com.baidu.test.Car;
public class Demo01 {

  public static void main (String[] args) {

    Car car = new Car();
    car.test1();
    // 不同包，不能访问com.baidu.test.Car的protected方法
    // car.test2();
    // ElectricCar是同包的类，不需要import
    ElectricCar eCar = new ElectricCar();
    // eCar的test3，因为是Car的子类。所以可以访问Car的test2受保护的方法
    eCar.test3();


  }
}


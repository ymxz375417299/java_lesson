package lesson11;

public class Demo01 {

  public static void main(String[] args) {
    // ### 正则表达式的构造摘要 - 数量词
    // - X? X，一次或一次也没有
    // - X* X，零次或多次
    // - X+ X，一次或多次
    // - X{n} X，指定出现 n 次
    // - X{n,} X，至少 n 次
    // - X{n,m} X，至少 n 次，但是不超过 m 次 */
    test6();
  }

  public static void test1() {
    String regex = "b?"; // 代表b出现0次或者1次

    System.out.println("b".matches(regex)); // true
    System.out.println("".matches(regex)); // ture 出现0次

    System.out.println("bb".matches(regex)); //  false 2次，超过了
    System.out.println("ab".matches(regex)); //  false 虽然值出现1次 但是还有出现其他b
  }

  public static void test2() {
    // - X* X，零次或多次X
    String regex = "b*"; // b 出现0 次，或者多次b
    System.out.println("b".matches(regex)); // true
    System.out.println("".matches(regex)); // ture 出现0次

    System.out.println("bb".matches(regex)); //  true 2次
    System.out.println("ab".matches(regex)); //  false 虽然值出现1次 但是还有出现其他b
  }

  public static void test3() {
    // - X+ X，至少一次或多次
    String regex = "b+"; // b 出现0 次，或者多次b
    System.out.println("b".matches(regex)); // true
    System.out.println("".matches(regex)); // flase  要求至少1个b

    System.out.println("bb".matches(regex)); //  true 2次
    System.out.println("ab".matches(regex)); //  false 虽然值出现1次 但是还有出现其他b
  }

  public static void test4() {
    // - X{n} X指定出现 n 次

    String regex = "b{3}"; // b出现3次
    System.out.println("bbb".matches(regex)); // true
    System.out.println("abbb".matches(regex)); // false
    System.out.println("bb".matches(regex)); // false
  }

  public static void test5() {
    // - X{n,} X至少出现n词

    String regex = "\\d{3,}"; // 至少出现3次数字
    System.out.println("1234".matches(regex)); // true
    System.out.println("a123".matches(regex)); // false
    System.out.println("123".matches(regex)); // true
  }
    // - X{n,m} X，至少 n 次，但是不超过 m 次 */
  public static void test6() {
    // - X{n,} X至少出现n词

    String regex = "\\d{3,5}"; // 至少出现3次数字
    System.out.println("1234".matches(regex)); // true
    System.out.println("123123".matches(regex)); // false 出现了6次了
    System.out.println("a1232".matches(regex)); //  false 有a
  }
}

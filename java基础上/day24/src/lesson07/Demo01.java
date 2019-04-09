package lesson07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Demo01 {
  public static void main(String[] args) {
    /**
     * 模拟斗地主 功能： 1. 准备一副牌（54张） 2. 洗牌 3. 发牌（三个人） 4. 留三张底牌 5. 每个人拿到牌后，对牌进行排序 6. 出牌。。。（算法比较复杂，这里不做） 1.
     * 发牌（每个人的牌先不排序） 2. 发牌（每个人的牌是排序的
     */

    // 1. 准备一副牌（54张） 用List<String>
    List<String> poker = new ArrayList<String>();
    // 牌的花色
    String[] colors = {"黑桃", "红心", "梅花", "方块"};

    // 牌的数组
    String[] nums = {
      "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"
    }; // 10是两个字符的，所以需要使用String而不是字符char

    // 遍历
    for (String color : colors) {
      for (String num : nums) {
        String pai = color + num; // 一张牌子
        poker.add(pai);
      }
    }

    // 少2个王
    poker.add("小王");
    poker.add("小王");

    // 2. 洗牌
    Collections.shuffle(poker);
    System.out.println("poker" + poker);

    // 3. 随机留三张底牌
    List<String> dipai = new ArrayList<String>();
    Random random = new Random(); // 创建一个随机对象
    for (int i = 0; i < 3; i++){
      int index  = random.nextInt(poker.size()); // 每次都获取一次poker的长度
      String pai = poker.remove(index); // 移除对应底牌的索引
      dipai.add(pai);
    }

    System.out.println("底牌: " + dipai);
    // 3. 发牌（三个人）
    // 创建三个集合，分别放各自的牌的集合
    List<String> gaojin = new ArrayList<String>(); // 高进
    List<String> longwu = new ArrayList<String>(); // 龙无
    List<String> me = new ArrayList<String>(); // 我

    for (int i = 0; i < poker.size(); i++) {
      // 取牌子
      String pai = poker.get(i);
      int mode = i % 3;
      if (mode == 0) {
        gaojin.add(pai);
      } else if (mode == 1) {
        longwu.add(pai);
      } else if (mode == 2) {
        me.add(pai);
      }
    }
    // 4. 留三张底牌
    // 5. 每个人拿到牌后，对牌进行排序
    System.out.println("高进: " + gaojin);
    System.out.println("龙五：" + longwu);
    System.out.println("我" + me);

  }
}

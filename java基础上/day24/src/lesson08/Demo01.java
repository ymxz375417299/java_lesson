package lesson08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import java.util.TreeSet;

public class Demo01 {
  public static void main (String[] args) {
    /**
     * 模拟斗地主 功能： 1. 准备一副牌（54张） 2. 洗牌 3. 发牌（三个人） 4. 留三张底牌 5. 每个人拿到牌后，对牌进行排序 6. 出牌。。。（算法比较复杂，这里不做） 1.
     * 发牌（每个人的牌先不排序） 2. 发牌（每个人的牌是排序的
     */

    // 1.准备一副牌（54）张
    Map<Integer, String> poker = new HashMap<Integer, String>();

    // 1.1 牌的花色
    String[] colors = {"方块", "梅花", "红桃", "黑桃"};

    // 1.2 牌的数组
    String[] nums = {
      "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"
    }; // 10是两个字符的，所以需要使用String而不是字符char

    // 1.3 遍历花色&数字
    
    int index = 0;
    for(String num : nums){
      for(String color : colors){
        String pai = color + num;
        // 1.4 把索引和牌添加到Map中
        poker.put(index, pai); // 添加牌到map中
        index ++;

      }
    }

    // 1.4 添加大王小王
    poker.put(index, "小王");
    index ++;
    poker.put(index, "大王");
    // 1.6 遍历poker
    for(Entry<Integer, String> entry : poker.entrySet()){
      System.out.println(entry.getKey() + " : " + entry.getValue() );
    }

    // 2. 洗牌
    // 2.1 获取牌的索引Set集合
    Set<Integer> pokerKeys = poker.keySet();

    // 因为Collections.shuffle传入的参数必须是List的，所以Set需要转List
    // 把Set 转成 List
    List<Integer> pokerIndexs = new ArrayList<Integer>();
    for (Integer i : pokerKeys){
      pokerIndexs.add(i);
    }

    // 2.2 把索引打乱
    Collections.shuffle(pokerIndexs); // 传入的参数，必须是List
    System.out.println("=========");
    System.out.println("打乱后的牌索引" + pokerIndexs);

    // 3. 留底牌【前三张】
    Set<Integer> dipaiIdxs = new TreeSet<Integer>();
    dipaiIdxs.add(pokerIndexs.remove(0));
    dipaiIdxs.add(pokerIndexs.remove(0));
    dipaiIdxs.add(pokerIndexs.remove(0));

    System.out.println("=====");
    System.out.println("底牌索引：" + dipaiIdxs);

    // 4. 发牌
    Set<Integer> gaojin = new TreeSet<Integer>();
    Set<Integer> longwu = new TreeSet<Integer>();
    Set<Integer> me = new TreeSet<Integer>();

    for (int i = 0; i < pokerIndexs.size(); i++){
      // 取出扑克的索引
      int pokerIndex = pokerIndexs.get(i);
      int mode = i % 3;
      if (mode == 0){
        gaojin.add(pokerIndex);
      }else if(mode == 1){
        longwu.add(pokerIndex);
      }else if(mode == 2){
        me.add(pokerIndex);
      }
    }

    // 5 打印每个人扑克牌的索引
    System.out.println("高进: " + gaojin );
    System.out.println("龙无" + longwu);
    System.out.println("我的" + me);

    // 6 看牌
    lookPoker("底牌", poker, dipaiIdxs);
    lookPoker("高进", poker, gaojin);
    lookPoker("龙五", poker, longwu);
    lookPoker("我的", poker, me);
  }


  // 看牌方法
  public static void lookPoker(String name, Map<Integer, String> poker, Set<Integer> playerPokerIndex){
    System.out.println("=========");
    System.out.println(name);

    // 玩家手上的牌
    List<String> pokerValues = new ArrayList<String>();
    // 遍历玩家的扑克牌索引
    for(Integer key: playerPokerIndex){
      pokerValues.add(poker.get(key)); // 给玩家对应的
    }
    System.out.println(pokerValues);
  }
}


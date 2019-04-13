package lesson12;

public class Demo01 {

  public static void main (String[] args) {
    /** 捋一捋IO流
     *
     * ## 一 IO流-输入输出流    
     * IO流操作文件夹，读取文件内容，往文件写文件
     * - I: input  
     *   - O: out
     *
     *   ## 二 字节流
     *   ### InpputSteram
     *   - FileInputStream 文件字节输入流，读的单位字节
     *   - BufferedInputStream 文件缓冲输入流，内部有个byte[]字节数组
     *   - SequenceInputStream 序列流，把多个字节流整合成一个流
     *   - ObjectInputStream 对象输入流，从文件中读取加载对象
     *   - System.in 标准的输入流-键盘
     *   - DataInputStream 数据输入流，按照基本数据类型的 大（如long)小来**读取**文件
     *
     *   ### OutputStream 
     *   - FileOutputStream 文件字节输出流，读取的单位是字节
     *   - BufferedOutputStream 文件缓冲输出流，内部有个byte[]字节数组
     *   - ByteArrayOutputStream 字节数组输出流，把数据保存到内存中，这个类不需要关联文件夹
     *   - ObjectOutputStream 对象输出流，直接把对象存入文件， 这个对象要实现serilazale接口
     *   - PrintStream 打印输出流，把内容打印到控制台
     *   - PrintWriter  打印输出流，把程序执行的println输出信息 保存到文件
     *   - System.out 标准输出流 - 指的是控制台 如果println
     *   - DataOutputStream 数据输出流，按照基本数据类型的大小来**写入**文件夹
     *   ## 三 字符流
     *   ### Reader
     *   - fileReader 文件读取流，读取的单位是字符
     *   - BuffereReader 缓冲字符读取流， 内部有个char[] 字符数组
     *   - InputStreamReader  指定字符编码读取文件
     *
     *   ### Writer
     *   - fileWriter 文件写入流，写人的单位是字符
     *   - BuffereWriter 缓冲写入流，内部有个char[]字符数组
     *   - OutputStreamWriter 指定字符编码写入文件
     *
     *   ### 四 RandomAccessFile 
     *   随机访问流，这个流，即不继承上面4种流，有一个特点，读和写都在一个类中
     *
     *   ### 五 Properties 
     *   相当于map一样使用，不过键和值都必须是字符串，帮数据持久存在后缀名`propertiesd文件`
     *   ### 
     */
  }
}


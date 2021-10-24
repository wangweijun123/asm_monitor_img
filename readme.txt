1. class 子节码结构
https://www.jianshu.com/p/183c2dc6f34a 
https://www.jianshu.com/p/888d959683a4 
效能组：性能优化，开发效率，测试效率
关注点：线上


基础知识的能力：原理 ，framework ，linux 内核，c++ 
ANR 检测实现方式：5 种
我们的方式：自己手写，核心代码，课后花一些时间
学习的方法：静、清


https://www.jianshu.com/p/252f381a6bc4
cafe babe 0000 0033 0022 0a00 0600 1409
0015 0016 0800 170a 0018 0019 0700 1a07
001b 0100 063c 696e 6974 3e01 0003 2829
5601 0004 436f 6465 0100 0f4c 696e 654e
756d 6265 7254 6162 6c65 0100 124c 6f63
616c 5661 7269 6162 6c65 5461 626c 6501
0004 7468 6973 0100 264c 636f 6d2f 6578
616d 706c 652f 6d79 6170 706c 6963 6174
696f 6e2f 4865 6c6c 6f57 6f72 6c64 3b01
0004 6d61 696e 0100 1628 5b4c 6a61 7661
2f6c 616e 672f 5374 7269 6e67 3b29 5601
0004 6172 6773 0100 135b 4c6a 6176 612f
6c61 6e67 2f53 7472 696e 673b 0100 0a53
6f75 7263 6546 696c 6501 000f 4865 6c6c
6f57 6f72 6c64 2e6a 6176 610c 0007 0008
0700 1c0c 001d 001e 0100 0c48 656c 6c6f
2057 6f72 6c64 2107 001f 0c00 2000 2101
0024 636f 6d2f 6578 616d 706c 652f 6d79
6170 706c 6963 6174 696f 6e2f 4865 6c6c
6f57 6f72 6c64 0100 106a 6176 612f 6c61
6e67 2f4f 626a 6563 7401 0010 6a61 7661
2f6c 616e 672f 5379 7374 656d 0100 036f
7574 0100 154c 6a61 7661 2f69 6f2f 5072
696e 7453 7472 6561 6d3b 0100 136a 6176
612f 696f 2f50 7269 6e74 5374 7265 616d
0100 0770 7269 6e74 6c6e 0100 1528 4c6a
6176 612f 6c61 6e67 2f53 7472 696e 673b
2956 0021 0005 0006 0000 0000 0002 0001
0007 0008 0001 0009 0000 002f 0001 0001
0000 0005 2ab7 0001 b100 0000 0200 0a00
0000 0600 0100 0000 0a00 0b00 0000 0c00
0100 0000 0500 0c00 0d00 0000 0900 0e00
0f00 0100 0900 0000 3700 0200 0100 0000
09b2 0002 1203 b600 04b1 0000 0002 000a
0000 000a 0002 0000 000c 0008 000d 000b
0000 000c 0001 0000 0009 0010 0011 0000
0001 0012 0000 0002 0013 
x 1cafe babe 0000 0033 0022 0a00 0600 140920015 0016 0800 170a 0018 0019 0700 1a073001b 0100 063c 696e 6974 3e01 0003 282945601 0004 436f 6465 0100 0f4c 696e 654e5756d 6265 7254 6162 6c65 0100 124c 6f636616c 5661 7269 6162 6c65 5461 626c 650170004 7468 6973 0100 264c 636f 6d2f 65788616d 706c 652f 6d79 6170 706c 6963 61749696f 6e2f 4865 6c6c 6f57 6f72 6c64 3b01100004 6d61 696e 0100 1628 5b4c 6a61 7661112f6c 616e 672f 5374 7269 6e67 3b29 5601120004 6172 6773 0100 135b 4c6a 6176 612f136c61 6e67 2f53 7472 696e 673b 0100 0a53146f75 7263 6546 696c 6501 000f 4865 6c6c156f57 6f72 6c64 2e6a 6176 610c 0007 0008160700 1c0c 001d 001e 0100 0c48 656c 6c6f172057 6f72 6c64 2107 001f 0c00 2000 2101180024 636f 6d2f 6578 616d 706c 652f 6d79196170 706c 6963 6174 696f 6e2f 4865 6c6c206f57 6f72 6c64 0100 106a 6176 612f 6c61216e67 2f4f 626a 6563 7401 0010 6a61 7661222f6c 616e 672f 5379 7374 656d 0100 036f237574 0100 154c 6a61 7661 2f69 6f2f 507224696e 7453 7472 6561 6d3b 0100 136a 617625612f 696f 2f50 7269 6e74 5374 7265 616d260100 0770 7269 6e74 6c6e 0100 1528 4c6a276176 612f 6c61 6e67 2f53 7472 696e 673b282956 0021 0005 0006 0000 0000 0002 0001290007 0008 0001 0009 0000 002f 0001 0001300000 0005 2ab7 0001 b100 0000 0200 0a00310000 0600 0100 0000 0a00 0b00 0000 0c00320100 0000 0500 0c00 0d00 0000 0900 0e00330f00 0100 0900 0000 3700 0200 0100 00003409b2 0002 1203 b600 04b1 0000 0002 000a350000 000a 0002 0000 000c 0008 000d 000b360000 000c 0001 0000 0009 0010 0011 0000370001 0012 0000 0002 0013 


Last modified 2021-1-7; size 586 bytes
  MD5 checksum bf91e508b76a0dc7d4c0250b0e55f75b
  Compiled from "HelloWorld.java"
public class com.example.myapplication.HelloWorld
  minor version: 0
  major version: 51
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #6.#20         // java/lang/Object."<init>":()V
   #2 = Fieldref           #21.#22        // java/lang/System.out:Ljava/io/PrintStream;
   #3 = String             #23            // Hello World!
   #4 = Methodref          #24.#25        // java/io/PrintStream.println:(Ljava/lang/String;)V
   #5 = Class              #26            // com/example/myapplication/HelloWorld
   #6 = Class              #27            // java/lang/Object
   #7 = Utf8               <init>
   #8 = Utf8               ()V
   #9 = Utf8               Code
  #10 = Utf8               LineNumberTable
  #11 = Utf8               LocalVariableTable
  #12 = Utf8               this
  #13 = Utf8               Lcom/example/myapplication/HelloWorld;
  #14 = Utf8               main
  #15 = Utf8               ([Ljava/lang/String;)V
  #16 = Utf8               args
  #17 = Utf8               [Ljava/lang/String;
  #18 = Utf8               SourceFile
  #19 = Utf8               HelloWorld.java
  #20 = NameAndType        #7:#8          // "<init>":()V
  #21 = Class              #28            // java/lang/System
  #22 = NameAndType        #29:#30        // out:Ljava/io/PrintStream;
  #23 = Utf8               Hello World!
  #24 = Class              #31            // java/io/PrintStream
  #25 = NameAndType        #32:#33        // println:(Ljava/lang/String;)V
  #26 = Utf8               com/example/myapplication/HelloWorld
  #27 = Utf8               java/lang/Object
  #28 = Utf8               java/lang/System
  #29 = Utf8               out
  #30 = Utf8               Ljava/io/PrintStream;
  #31 = Utf8               java/io/PrintStream
  #32 = Utf8               println
  #33 = Utf8               (Ljava/lang/String;)V
{
  public com.example.myapplication.HelloWorld();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 10: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lcom/example/myapplication/HelloWorld;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
         3: ldc           #3                  // String Hello World!
         5: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         8: return
      LineNumberTable:
        line 12: 0
        line 13: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  args   [Ljava/lang/String;
}

常量池自己花点时间去看
0021：类的访问标记，ACC_PUBLIC + ACC_SUPER
0005:  #5 类的索引
0006:  #6 父类的索引
0000：属性表的数量
0002：方法表的数量


stack=1，locals=1，args_size=1


2. 类的加载流程
加载，验证，准备，解析，初始化


遇到 new、getstatic、putstatic 或 invokestatic 这 4 条字节码指令时，如果类没有进行过初始化，则需要先触发其初始化。生成这 4 条指令最常见的 Java 代码场景是：使用 new 关键字实例化对象、读取或设置一个类的静态字段（被 final 修饰、已在编译期把结果放入到常量池的静态字段除外）以及调用一个类的静态方法的时候
使用 java.lang.reflect 包的方法对类进行反射调用的时候
当初始化一个类的时候，如果发现其父类还没有被初始化过，则需要先触发其父类的初始化


3. 双亲委派模型


《gradle 的基础》



1. gradle 打包 apk 的编译流程
https://www.jianshu.com/p/4962634901fb 


2. asm 底层实现原理
修改字节码文件，达到代码统一插桩的效果。
aspectJ 底层的实现原理就是 asm ，对 asm 的封装。代码的灵活度没有那么高，但是使用简易
学习 asm 难度肯定会稍微大一点，但是可以理解成一个傻瓜式操作，前提是要能想到怎么做


3. gradle + asm 常见使用场景 
场景：需要修改 class 字节码的都适用
范围：除了系统的class不能插入，像自己写的第三方库文件都是可以的
ImageView：asm 不能插桩，从当时手机系统里面去加载，甚至是 Zygote 启动的时候就被加载了，其实是开启启动的时候就被加载了。AppCompatActivity：能插桩，从 apk 中的 dex 中加载的。本质区分：运行原理去区分其他区分：gradle 中有引入的就能被插桩，没有引入的就不能被插桩单测：覆盖率（asm），80%架构师：定义？搭建架构，保证工程质量，重构设计，大局观代码怎么调试：有没有好的思路，有没有生效看运行，出现异常只能看代码，断点4. 回顾访问者设计模式
https://www.jianshu.com/p/e4b8cb0b3204 
设计模式（我写的）：生搬硬套去实现，忘记，随心所欲
小龙：动手能力，想象力，有勇气折腾



https://www.jianshu.com/p/206d00dfd683 


会举一反三，最主要的还是要实践

https://live.bilibili.com/3862229?visit_id=7gthtl37onk0

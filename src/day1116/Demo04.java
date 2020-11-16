package day1116;

import java.util.Random;
import java.util.Scanner;

//基本数据类型包括 boolean（布尔型）、float（单精度浮点型）、char（字符型）、byte（字节型）、short（短整型）
// 、int（整型）、long（长整型）和 double （双精度浮点型）共 8 种
public class Demo04 {
    public static void main(String[] args) {
        byte a = 20;
        short b = 40;
        int c = 60;
        long d = 80;
        String e = "90";
        long sum1 = a + b + c + d;
        String sum2 = a + b + c + d +e;
        System.out.println("a+b+c+d=" + sum1);
        System.out.println("a+b+c+d+e=" + sum2);
        //因为前四种都是整数类型可以相加 而非字符串之间的连接

        //char 用来表示单个的字符
        //a 变量首先被赋值为“A”，字母 A 在 ASCII（和 Unicode）中对应的值为 65。接着又定义了一个类型为 char 的变量 b，赋值
        // 为“B”，字母 B 在 ASCII（和 Unicode）中所对应的值为 66。因此相加后得出的结果为 131。
        char numChara ='A';
        char numCharb ='B';
        System.out.println(numChara + numCharb);

        double abc = 234.3456;

        System.out.println(abc);
        //强转
        //(type)variableName  type 为 variableName 要转换成的数据类型，而 variableName 是指要进行类型转换的变量名称
        int number1 = 0;
        System.out.print("请输入一个数：" );
        Scanner input = new Scanner(System.in);
        number1 = input.nextInt();
        System.out.println("输入的数为：" + number1);
//        int asd =900;
        System.out.printf("%s", number1);
        // print不换行 println 换行 printf可以传参
    }
}


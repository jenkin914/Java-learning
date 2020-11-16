package day1116;

import java.util.Scanner;

public class Demo05 {
    public static void demofor1(){
        int[] numbers = {1,2,3,4,5,6,6,7,8,9};
        for (int number:numbers){
            System.out.println(number);
        }
    }
    public static void  demofor2(){
        String[] urls = {"www.baidu.comm","wwww.google.com","www.youku.com"};
        for (String url : urls){
            System.out.println(url);
        }
    }
    public static void main(String[] args) {
        // 三目表达式
        int x, y, z;
        System.out.print("请输入一个数：");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y = x > 5 ? x : -x;
        z = y > x ? y : 5;
        System.out.printf("x = %s \n",x);
        System.out.printf("y = %s \n",y);
        System.out.printf("z = %s \n",z);
        demofor1();
        demofor2();
    }
}

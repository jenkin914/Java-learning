package day1116;

/**
 * @author Jenkin
 * @version jdk12.0
 */
// javadoc -encoding UTF-8 -charset UTF-8 -author -version D:\myjava\src\day1116\Demo02.java
/*
方法的重载 overload  多个方法的名称一样， 但是列表参数不一样
好处 记住一个方法名称 就可以实现类似的功能
*/

public class Demo02{
    /**
     * 求两个参数内的整数和
     * @param m 接收第一个参数，范围的起点
     * @param n 接收的第二个参数，范围的终点
     * @return 两个参数范围内的整数和
     */
    private int add(int m, int n){
        int sum = 0;
        for (int i=m; i <= n; i++){
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Demo02 a = new Demo02();
        int b = a.add(1,100);
        System.out.println(b);
    }
}


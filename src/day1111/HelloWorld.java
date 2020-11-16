package day1111;

public class HelloWorld{
    public static void main(String[] args) {
        System.out.println("Hello World");
//        for (初始化语句，条件判断；步进表达式) {
//            循环体
//        }
        for (int i = 1; i <= 100; i ++) {

            if (i == 5) {
                continue;
            }
            System.out.println(i);
            if (i == 88) {
                System.out.println("这个是while："+i);
                break;
            }
        }
    }
}

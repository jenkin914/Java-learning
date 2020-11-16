package day1111;

public class demo01 {
    public static void fordemo(){
        for (int i = 1; i < 100; i ++) {

            System.out.println(i);
        }
        System.out.println("开始for循环");
    }
    public static void qiuhe(){
        int sum = 0;
        for (int i =1;i<=100; i++){
            if (i%2==0){
                sum = sum +i;
            }
            if (i == 50){
                System.out.println("i=50 break循环");
                break;
            }
        }
        System.out.println("1-100的偶数求和为:" + sum);
    }

    public static void main(String[] args) {
//        int i = 1 ;
//        while (i<100) {
//            System.out.println(i);
//            i += 1;
//        }
//        day1111.demo01 a = new day1111.demo01();
//        a.fordemo();
//        System.out.println("结束for循环");
        qiuhe();
    }

}

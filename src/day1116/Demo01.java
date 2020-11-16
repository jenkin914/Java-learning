package day1116;
/*对于一个void没有返回值的， 不能写return后面的返回值，只能return自己
方法定义之后不会被执行，如果希望被调用一定要调用：单独调用，打印调用，赋值调用
一个方法中可以有多个return语句必须保证只能执行一个
*/
public class Demo01 {
    public static int method1(){
        //必须有返回值
        return 1;
    }
    public static void method2(){
        System.out.println("AAA");
        System.out.println("BBB");
        //没有返回值可以不写return
    }
    public static int getMax(int a, int b){
//        int max;
//        if (a>b){
//            max =a;
//        } else{
//          max=b;
//        }
        if (a>b){
            return a;
        }else{
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println(getMax(1,5));
    }
}

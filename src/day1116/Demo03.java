package day1116;
// java常量的定义和分类
//final dataType variableName = value   final 是定义常量的关键字，dataType 指明常量的数据类型，
// variableName 是变量的名称，value 是初始值。
public class Demo03 {
    // 静态常量
    public static final double PI = 3.14;
    // 声明成员常量
    final int PB =10;


    public static void main(String[] args) {
        //声明局部常量
        final double x = 3.1;
        final int y =10;

        System.out.println(x+y);
        String username = "李四";
        System.out.println(username);
    }
}

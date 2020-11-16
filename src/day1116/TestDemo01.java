package day1116;

public class TestDemo01 {
    public static void main(String[] args) {
        //创建类的对象
        Datademo01 data = new Datademo01();
        //对象名 变量名调用实例变量（全局变量）
        System.out.println(data.name = "jenkin");
        System.out.println(data.age = 24);

        System.out.println(data.website);
        System.out.println(data.URL);
        // 类名 变量名 调用静态变量
        System.out.println(Datademo01.website);
        System.out.println(Datademo01.URL);
    }
}

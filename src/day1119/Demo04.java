package day1119;

import java.util.Scanner;

public class Demo04 {
    public static void gettest(){
        String [] news = new String[] {
                "如何快速掌握Java", "听老王剖析Java中的运算符", "学习Java的十大忠告", "你所不知道的java网络编程技巧大全", "Java面试题大全"
        };
        String title = "==========新闻列表=============";
        System.out.println(title.substring(5,20));
        for (int i = 0; i < news.length; i++) {
            if (news[i].length() > 10){
                System.out.println(news[i].substring(0,10) + "...");
            }else{
                System.out.println(news[i]);
            }

        }
    }
    public static void  mysystem(){
        String sys = "学生管理系统";
        System.out.printf("欢迎进入《%s》系统", sys);
        System.out.println("请输入管理员密码：");
        Scanner input = new Scanner(System.in);
        String pwd = input.next();
//        System.out.println(pwd);

        System.out.println("请再次输入密码：");
        String pwd1 = input.next();
//        System.out.println(pwd1);
        if (pwd.equals(pwd1)) {
            System.out.println("登录成功");
        }else{
            System.out.println("两次输入不一致，请重新输入");
        }

    }
    public static void main(String[] args) {
        gettest();
        mysystem();

    }
}

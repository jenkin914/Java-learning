package day1119;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo05 {
    public static void gettest(){
        String words = "today,monday,sunday";
        System.out.println(words.charAt(4));
        System.out.println(words.indexOf("y"));
    }
    public static void set_pwd(){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一串英文字符串: ");
        String pwd = input.next();
        char [] pwd_c = pwd.toCharArray();
        for (char i : pwd_c) {
            System.out.println(i);
        }
    }
    public static void mybuffer(){
        StringBuffer str1 = new StringBuffer();
        StringBuffer sb = new StringBuffer("she is beautiful");
        sb.delete(3,6);
        System.out.println(sb);
    }
    public static void zhengze(){
        String a = "Hello,java!";
        String b = a.replaceAll("\\W", "123");
        System.out.println(b);

        Pattern p = Pattern.compile("a*b");
        Matcher m = p.matcher("aaaab");
        boolean n = m.matches();



    }
    public static void main(String[] args) {
//        gettest();
//        set_pwd();
//        mybuffer();
        zhengze();
    }
}

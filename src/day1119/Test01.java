package day1119;
import  java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test01 {
    public static void main(String[] args) {
        String regex = "0\\d{2,3}[-]?\\d{7,8}|0\\d{2,3}\\s?\\d{7,8}|13[0-9]\\d{8}|15[1089]\\d{8}";
        String answer = "Y";
        do{
            System.out.println("你可以留下一个电话号码");
            System.out.print("请留下你的电话号码：");
            Scanner input = new Scanner(System.in);
            String phone = input.next();    //  接收用户控制台输入的电话号码
            Pattern pattern = Pattern.compile(regex);    // 编译正则表达式
            Matcher matcher = pattern.matcher(phone);
            boolean bool = matcher.matches();
            if (bool) {
                System.out.println("输入的电话号码正确。");
            }else {
                System.out.println("输入的电话号码不正确，格式错误");
            }
            System.out.println("是否继续输入？（Y/N 或者 y/n）");
            answer = input.next();
        }while (answer.equalsIgnoreCase("Y"));
        System.out.println("成功注册电话号码 注册结束");
    }
}

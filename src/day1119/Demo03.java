package day1119;

import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {
        String str = "      sdfg 我去  adfg         ";
        System.out.println(str.toLowerCase());   //sdfg 我去  adfg
        System.out.println(str.toUpperCase());   //SDFG 我去  ADFG

        String str1 = str;
        System.out.println(str1);
        System.out.println(str1.length());
        System.out.println(str1.trim().length());
        String str2 = str1.replace("我去", "我又回来了");
        System.out.println(str2);
        System.out.println(str1);

        System.out.println("=======================");
        System.out.println(str1.strip());
        String strv1 = "我爱python编程";
        System.out.println(strv1.substring(8));
        System.out.println("=======字符串分割========");
        String strv2 = "Hello,world";
        String[] strv3 = strv2.split(",");
        System.out.println(Arrays.toString(strv3));   //[Hello, world]

        System.out.println(strv3[1]);  //world

        for (String a: strv3)
            System.out.println(a);
    }
}

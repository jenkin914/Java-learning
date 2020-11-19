package day1119;

public class Demo01 {
    public static void main(String[] args) {
        char a[] = {'H', 'e', 'l', 'l', 'o'};
        String sChar = new String(a);
        a[1] = 's';
        String sChar1 = new String(a, 1, 4);
        System.out.println(sChar);
        System.out.println(a);
        System.out.println(sChar1);

        String b = "1234";
        System.out.println(b);
        int c = 0;
        c = Integer.parseInt(b);
        System.out.println(c);
        String d = b + c;
        System.out.println(d);
    }
}
package exercisesandtests.statictests;

public class Tests {
    public static void main(String[] args) {

        String a = new String("abc");
        a = "abc";
        String b = "abc";
        String k = "abc";

        System.out.println(a);
        System.out.println(a == b);
        System.out.println(b.equals(k));
        System.out.println(b == k);

        Integer c = 2;
        Integer d = 2;
        System.out.println(c == d);

        Integer s = 128;
        Integer z = 128;
        System.out.println(s == z);
        System.out.println(s.equals(z));

        String o = "1";
        o+="2";
        o+="3";
        System.out.println (o);//123

        String str = "Java";
        str += " 8";
        System.out.println(str);

        int m=2;
        int n=5;
        int min=(m<n)?m:n;
        System.out.println(min);
    }
}

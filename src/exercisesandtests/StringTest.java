package exercisesandtests;

public class StringTest {
    public static void main(String[] args) {
        String s1 = new String("String one");
        String s2 = "String two";
        String s3 = "String " + "three";

        System.out.println(s3);

        String pirateMessage = "  Buried Treasure Chest! ";
        char c3 = pirateMessage.charAt(3);
        System.out.println(c3);

        int i1 = pirateMessage.indexOf('u');
        System.out.println(i1);

        int i2 = pirateMessage.indexOf('u', 9);
        System.out.println(i2);

        int i3 = pirateMessage.indexOf("Treasure", 0);
        System.out.println(i3);

        int i = pirateMessage.length();
        System.out.println(i);  //25

        String[] stringArray = new String[i];
        int arrayLenght = stringArray.length;
        System.out.println(arrayLenght);  //25

        String c = pirateMessage.concat("Weigh anchor!");
        System.out.println(c);

        String z1 = pirateMessage.replace('B', 'J');
        System.out.println(z1);

        String z3 = pirateMessage.replace("Chest", "Coins");
        System.out.println(z3);

        boolean b1 = pirateMessage.startsWith("  Buried Treasure");
        System.out.println(b1);

        boolean b2 = pirateMessage.startsWith("Treasure", 9);
        System.out.println(b2);

        boolean b3 = pirateMessage.endsWith("Treasure Chest! ");
        System.out.println(b3);

        String ss1 = pirateMessage.substring(9);
        System.out.println(ss1);

        String ss2 = pirateMessage.substring(9, 10);
        System.out.println(ss2);

        String t = pirateMessage.trim();
        System.out.println(t);

        String lc = pirateMessage.toLowerCase();
        System.out.println(lc);

        String uc = pirateMessage.toUpperCase();
        System.out.println(uc);

        byte a = 50;
        System.out.println(a <<= 3);

        Integer value1 = new Integer("312");
        Integer value2 = new Integer("312");
        System.out.println(value1.equals(value2));

        int score = 10;
        System.out.println("score" + score++);
        System.out.println("score" + score);



    }
}

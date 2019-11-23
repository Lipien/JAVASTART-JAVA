package exercisesandtests.wrappersofprimitesareimmutable;

class Demo {
    public static void main(String[] args) {
        Integer j = 12;
        System.out.println(j); // 12
        modify(j);
        System.out.println(j); // 12 because Integer is immutable

        Integer i = 10;
        Integer k = i;
        System.out.println("k's value = " + k);
        System.out.println("k's hashCode = " + System.identityHashCode(k));
        System.out.println("i's value = " + i);
        System.out.println("i's hashCode = " + System.identityHashCode(i));
        i = i + 10;
        System.out.println("k's value = " + k);
        System.out.println("k's hashCode = " + System.identityHashCode(k));
        System.out.println("i's value = " + i); //i's value = 20
        System.out.println("i's hashCode = " + System.identityHashCode(i));

        String name = "baeldung";
        String newName = name.replace("dung", "----");

        System.out.println(name.equals(newName));
        System.out.println(name);

        String z = "Sachin";
        z.concat(" Tendulkar");//concat() method appends the string at the end
        System.out.println(z);//will print Sachin because strings are immutable objects

        String s = "Sachin";
        s = s.concat(" Tendulkar");
        System.out.println(s);//SachinTendulkar ; explicitely assigned reference
    }

    private static void modify(Integer i) {
        i = i + 1;
    }
}

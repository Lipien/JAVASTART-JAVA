package variables;

public class Variables {
    public static void main(String[] args) {
        String firstName = "Sławek";
        String lastName = "Ludwiczak";
        final String pesel = "12312312312";
        int age = 25;
        double height = 179.5;

        System.out.print("Cześć ");
        System.out.print(firstName);
        System.out.print(" ");
        System.out.println(lastName);

        System.out.println("Poniżej jest kilka informacji o Tobie:");
        System.out.print("Twój PESEL to: ");
        System.out.println(pesel);
        System.out.print("Masz ");
        System.out.print(age);
        System.out.println(" lat");

        System.out.print("Twój wzrost to: ");
        System.out.print(height);
        System.out.print("cm");
    }
}

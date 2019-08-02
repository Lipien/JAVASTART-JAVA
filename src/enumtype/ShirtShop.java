package enumtype;

import java.util.Scanner;

public class ShirtShop {
    public static void main(String[] args) {
        System.out.println("Dostępne rozmiary tshirtów: ");
        for (Size s : Size.values()) {
            System.out.println(s.getDescription());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz rozmiar: ");
        String sizeDesc = sc.nextLine(); // np. "Mały"
        Size size = Size.fromDescription(sizeDesc);
        Tshirt tshirt = new Tshirt();
        tshirt.setSize(size);
        System.out.println("Wybrałeś tshirt w rozmiarze: " + tshirt.getSize().getDescription());
    }
}

package enumtype;

public class ShirtShop {
    public static void main(String[] args) {
        System.out.println("Dostępne rozmiary:");
        System.out.println(Size.SMALL.getDescription());
        System.out.println(Size.MEDIUM.getDescription());
        System.out.println(Size.LARGE.getDescription());

        Tshirt tshirt = new Tshirt();
        tshirt.setSize(Size.MEDIUM);
        System.out.println(tshirt.getSize());
        System.out.println("Rozmiar Tshirta: " + tshirt.getSize().getDescription());

        Size[] values = Size.values();

        for(int i = 0; i<values.length; i++)
        System.out.println(values[i]);
    }
}

package inheritance;

public class PartsApp {
    public static void main(String[] args) {
        Wheel sportWheel = new Wheel("B01", "Pirelli",
                "Sport", "cvm", 19, 220);


        Tire goodyearTyre = new Tire("B01", "Pirelli",
                "Sport", "cvm", 19, 220);

        ExhaustPart pipe = new ExhaustPart("B01", "Pirelli",
                "Sport", "cvm", true);
    }
}

package inheritance;

public class Wheel extends Part {

    private int wheelSize;
    private int wheelWidth;

    public Wheel(String idNumber, String manufacturer, String model, String productSerie,
                 int wheelSize, int wheelWidth) {
        super(idNumber, manufacturer, model, productSerie);
        this.wheelSize = wheelSize;
        this.wheelWidth = wheelWidth;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public int getWheelWidth() {
        return wheelWidth;
    }

    public void setWheelWidth(int wheelWidth) {
        this.wheelWidth = wheelWidth;
    }
}

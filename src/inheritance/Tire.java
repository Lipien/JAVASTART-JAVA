package inheritance;

public class Tire extends Part {

    private int tireSize;
    private int tireWidth;

    public Tire(String idNumber, String manufacturer, String model, String productSerie, int titeSizesize, int tireWidth) {
        super(idNumber, manufacturer, model, productSerie);
        this.tireSize = titeSizesize;
        this.tireWidth = tireWidth;
    }

    public int getTireSize() {
        return tireSize;
    }

    public void setTireSize(int tireSize) {
        this.tireSize = tireSize;
    }

    public int getTireWidth() {
        return tireWidth;
    }

    public void setTireWidth(int tireWidth) {
        this.tireWidth = tireWidth;
    }
}

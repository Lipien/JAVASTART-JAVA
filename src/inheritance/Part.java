package inheritance;

public class Part {

    private String idNumber;
    private String manufacturer;
    private String model;
    private String productSerie;

    public Part(String idNumber, String manufacturer, String model, String productSerie) {
        this.idNumber = idNumber;
        this.manufacturer = manufacturer;
        this.model = model;
        this.productSerie = productSerie;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProductSerie() {
        return productSerie;
    }

    public void setProductSerie(String productSerie) {
        this.productSerie = productSerie;
    }
}

package inheritance;

public class ExhaustPart extends Part {

    private boolean isCompliantToEuStandards;

    public ExhaustPart(String idNumber, String manufacturer, String model, String productSerie,
                       boolean isCompliantToEuStandards) {
        super(idNumber, manufacturer, model, productSerie);
        this.isCompliantToEuStandards = isCompliantToEuStandards;
    }

    public boolean isCompliantToEuStandards() {
        return isCompliantToEuStandards;
    }

    public void setCompliantToEuStandards(boolean compliantToEuStandards) {
        isCompliantToEuStandards = compliantToEuStandards;
    }
}

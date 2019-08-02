package enumtype;

enum Size {
    SMALL("Mały"), MEDIUM("Średni"), LARGE("Duży");

    private final String description;

    private Size(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

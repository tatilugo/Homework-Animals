package DataGeneral;

public enum ColorsData {

    BLACK("Черный"),

    WHITE("Белый"),

    RED("Красный"),

    YELLOW("Желтый"),
    ORANGE("Оранжевый");

    private String name;

    ColorsData(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

package a0707;

public class Car3 {
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;

    public Car3(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    Car3() {
        this("현대", 2016, "blue", 400);
    }

    public String getModel() {
        return this.modelYear + "년식" + this.modelName + " " + this.color;
    }
}

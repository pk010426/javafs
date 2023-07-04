package a0704;

public class Ex6_11 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "blue";
        c1.gearType = "auto";
        c1.door = 4;
        Car c2 = new Car();
        c2.color = "green";
        c2.gearType = "auto";
        c2.door = 6;


        System.out.println(c1.color);
        System.out.println(c1.gearType);
        System.out.println(c1.door);
        System.out.println();
        System.out.println(c2.color);
        System.out.println(c2.gearType);
        System.out.println(c2.door);

    }
}

class Car {
    String color;
    String gearType;
    int door;
}
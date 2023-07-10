package a0707.추상클래스;

public class phone {
    String owner;

    public phone(String owner) {
        this.owner = owner;
    }

    void turnOn() {
        System.out.println("폰 켜짐");
    }
    void turnOff() {
        System.out.println("폰 꺼짐");
    }

}

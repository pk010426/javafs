package a0706;

public class AirplaneBlue extends Airplane{
    public static final int NORMAR =1;
    public static final int SUPERSONIC =2;

    public int flyMode = NORMAR;

    public void fly() {
        if (flyMode == SUPERSONIC) {
            System.out.println("초음속 비행");
        } else {
            super.fly();
        }
    }
}

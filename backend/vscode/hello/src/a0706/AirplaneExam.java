package a0706;

public class AirplaneExam {
    public static void main(String[] args) {
        AirplaneBlue a1 = new AirplaneBlue();

        a1.takeOff();
        a1.fly();
        a1.flyMode = AirplaneBlue.SUPERSONIC;
        a1.fly();
        a1.flyMode = AirplaneBlue.NORMAR;
        a1.fly();
        a1.land();;
    }
}

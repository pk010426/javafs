package a0707;

public class CarExam {
    public static void main(String[] args) {
        Car mycar = new Car();

        mycar.tire = new Tire();
        mycar.run();

        mycar.tire = new HanTire();
        mycar.run();

        mycar.tire = new kumTire();
        mycar.run();
    }
}

package a0712;

public class GenericExam1 {
    public static void main(String[] args) {
        HomeAgency homeAgency = new HomeAgency();
        Home home =homeAgency.rent();
        home.turnOnLight();

        CarAgency carAgency = new CarAgency();
        Car2 car = carAgency.rent();
        car.run();

    }
}
    // HomeAgency의 rent() 메서드를 호출 home 객체 얻음 home에서 불을 켬
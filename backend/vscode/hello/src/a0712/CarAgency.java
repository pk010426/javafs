package a0712;

public class CarAgency implements Rentable<Car2>{
    @Override
    public Car2 rent() {
        return new Car2();
    }
}

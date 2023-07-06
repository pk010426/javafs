package a0706;

public class Computer extends Caculator {
    @Override
    public double areaCicle(double r) {
        System.out.println("computer 객체의 areaCicle 실행");
        return Math.PI * r * r;
    }
}

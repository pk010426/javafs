package a0628;

public class Ex3_11 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000);
        // 3141.992
        // round가 반올림해줌. 3142가 됌
        System.out.println(shortPi);
    }
}

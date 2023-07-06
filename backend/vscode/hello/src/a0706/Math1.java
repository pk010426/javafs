package a0706;

public class Math1 {
    public static void main(String[] args) {
        // 소수점 올림
        System.out.println(Math.ceil(10.0));
        System.out.println(Math.ceil(10.1));
        System.out.println(Math.ceil(10.00001));
        // 소수점 버림
        System.out.println(Math.floor(10.0));
        System.out.println(Math.floor(10.9));
        System.out.println(Math.floor(10.54519));
        // 소수점 반올림
        System.out.println(Math.round(10.0));
        System.out.println(Math.round(10.4444494));
        System.out.println(Math.round(10.5));

    }
}

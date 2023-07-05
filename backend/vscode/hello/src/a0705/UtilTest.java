package a0705;

public class UtilTest {
    public static void main(String[] args) {
        Util.m1();
        // Util.m2(); < static 메소드가 아니라 이렇게는 선언 불가
        Util util = new Util();
        util.m2();
    }
}

class Util {
    static void m1() {
        System.out.println("클래스 메소드 m1() 호출 완료");
    }
    void m2() {
        System.out.println("인스턴스 메소드 m2 호출 완료");
    }
}
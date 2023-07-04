package a0704;

class Data {
    int x;
}

public class Ex6_6 {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;

        System.out.println("main() : x = " + d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
    }
    // 스태틱 메서드의 역할은 인스턴스 생성없이 클래스 이름으로 직접호출 가능
    static void change(int x) { // 기본형 매개변수
        x = 1000; // 지역변수는 메소드 안에서만 유효, 전역 변수로 바꾸려면 return 사용
        System.out.println("change() :  x = " + x);
    }
}

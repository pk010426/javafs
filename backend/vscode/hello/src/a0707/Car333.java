package a0707;

public class Car333 {
    public static void main(String[] args) {
        Car3 c1 = new Car3();
        Car3 c2 = new Car3();

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c1.equals(c2));

        c1 =  c2;
        System.out.println(c1.equals(c2));
        System.out.println(c1);
        // toString() 메소드는 해당 인스턴스에 대한정보를 문자열로 반환
        // 클래스 이름과 함께 구분자 @ 사용, 그 뒤에 해시코드 추가
    }
}

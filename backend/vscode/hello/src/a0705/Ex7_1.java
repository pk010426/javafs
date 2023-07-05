package a0705;

public class Ex7_1 {
    public static void main(String[] args) {

        cat c = new cat();
        // 클래스타입 레퍼런스 변수명()에 연결
        c.name = "떡냥이";
        c.breeds = "노르웨이숲";
        c.weight = 5.2;
       
        System.out.printf("이름 : %s%n", c.name);
        System.out.printf("품종 : %s%n", c.breeds);
        System.out.printf("체중 : %.2fkg%n", c.weight);
        c.claw();
        c.meow();
    }

}

class cat {
    // 객체 속에 존재하는 필드 - 인스턴수 변수(iv)
    String name;
    String breeds; // 품종
    double weight;

    void claw() {
        System.out.println("할퀴기!");
    }

    void meow() {
        System.out.println("냐옹");
    }
}

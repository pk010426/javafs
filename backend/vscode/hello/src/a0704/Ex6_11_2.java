package a0704;

public class Ex6_11_2 {
    public static void main(String[] args) {
        Carss c1 = new Carss("white", "auto", 4);
        Carss c2 = new Carss("red", "auto", 4);
        Carss c3 = new Carss(); //얘가 동작함
        // 인스턴스 초기화라고 함
        c3.color = "orange";
        c3.gearType = "menual";
        c3.door = 3;

        System.out.println(c1.color);
        System.out.println(c1.gearType);
        System.out.println(c1.door);
        System.out.println();
        System.out.println(c2.color);
        System.out.println(c2.gearType);
        System.out.println(c2.door);
    }
}

class Carss {
    String color;
    String gearType;
    int door;
    
    Carss(){}; // < 애가 있어야만
    Carss(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
    //인스턴스 변수의 초기화
    // 생성자의 이름은 클래스의 이름과 같아야 한다.
    // 생성자는 리턴값이 없다.
}
package a0705;

public class Herotest {
    public static void main(String[] args) {
        Hero onePunchMan = new Hero("원펀맨", 100, 100);
        Hero zeNos = new Hero("제노스", 80, 90);

        System.out.println(onePunchMan.toStr());
        System.out.println(zeNos.toStr());
    }
}

class Hero {
    String name;
    int power;
    int speed;

    // 생성자 정의
    Hero(String n, int p, int s) {
        name = n;
        power = p;
        speed = s;
    }
    // 객체 정보를 문자열로 반환
    String toStr() {
        return String.format("Hero{name : %s, power : %d, speed : %d}", name, power, speed);
    }
}

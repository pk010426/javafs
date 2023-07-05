package a0705;

public class AvengerTest {
    public static void main(String[] args) {
        Avenger thor = new Avenger("토르", 200);
        Avenger thanos = new Avenger("타노스", 300);
        thor.punch(thanos);
        thor.punch(thanos);
        thanos.punch(thor);
    }
}

class Avenger {
    String name;
    int hp;

    public Avenger(String n, int h) {
        name = n;
        hp = h;
    }
    // Avenger는 클래스 이름 enemy는 매개변수의 이름
    void punch (Avenger enemy) {
        System.out.printf("[%s]의 공격 ",name);
        enemy.hp -=10;
        System.out.printf("%s의 체력 : %d\n", enemy.name, enemy.hp);
    }

}

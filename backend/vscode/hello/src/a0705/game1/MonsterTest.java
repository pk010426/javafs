package a0705.game1;

public class MonsterTest {
    public static void main(String[] args) {
        Monster orc = new Monster("오크");
        Monster skeleton = new Monster("해골");
        Monster.battle(orc, skeleton);
    }
}

class Monster {
    String name;
    int hp;
    static int maxHp = 30;

    Monster(String s) {
        name = s;
    }

    void attack(Monster enemy) {
        enemy.hp -= 10;
    }

    static void battle(Monster a, Monster b) {
        a.hp = maxHp;
        b.hp = maxHp;
        while (a.hp > 0 && b.hp > 0) {
            Monster attackr = (Math.random() < 0.5) ? a : b;
            Monster defender = (attackr == a) ? b : a;
            attackr.attack(defender);
            System.out.printf("[%s]의 공격! > [%s]의 체력 : %d / %d\n", attackr.name, defender.name, defender.hp,
                    defender.maxHp);

            if (a.hp == 0) {
                System.out.printf("%s가 승리하였습니다!", b.name);
            }
            if (b.hp == 0) {
                System.out.printf("%s가 승리하였습니다!", a.name);
            }
        }
    }

}

package a0707;

public class Archer {
    String name;
    String power;

    public Archer(String name, String power) {
        this.name = name;
        this.power = power;
    }
    // object는 모든 객체의 조상클래스
    public boolean equals(Object obj) {
        Archer temp = (Archer) obj; // object가 아처보다 더 높은 부모이기 때문에 상속을 받음
        if (name == temp.name && power == temp.power) {
            return true;
        } else {
            return false;
        }
    }
}

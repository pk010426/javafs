package a0707.추상클래스;

public class main {
    public static void main(String[] args) {
        dog dog = new dog();
        cat cat = new cat();
        dog.crying();
        cat.crying();
        System.out.println("---------");
        animalSound(new dog());
        animalSound(new cat());
    }
    public static void animalSound(animal ani) {
        ani.crying();
    }
}
// 추상
// 미완성 클래스
// 직접적으로 객체 인스턴스를 생성할 수 없음
// 설계 틀 같은놈
// 꼭 상속받아야 하며 추상 메소드는 반드시 구현해야 함

// public > abstract 바꿔서 추상 알림
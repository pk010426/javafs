package a0705;

public class Dog {
    // 객체 지향 프로그래밍 - object oriented programming
    String name;
    String breeds; // 품종
    int age;

    void wag() {
        System.out.printf("[%s]꼬리흔듦%n", name);
    }

    void bark() {
        System.out.printf("[%s]멍멍%n", name);
    }

    void bark(int times) {
        String sound = "월월!";
        System.out.printf("[%s] %s(x%d)%n", name, sound, times);
    }
    // 메소드 오버로딩 - 입력변수의 갯수나 타입으로 구분하는 기법
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();

        d1.name = "멍뭉이";
        d1.breeds = "시츄";
        d1.age = 5;

        d2.name = "밀크";
        d2.breeds = "말티즈";
        d2.age = 12;

        System.out.printf("d1 => {%s, %s, %d세}%n", d1.name,d1.breeds,d1.age);
        System.out.printf("d2 => {%s, %s, %d세}%n", d2.name,d2.breeds,d2.age);
        
        d1.wag();
        d2.bark();
        d2.bark(87);
    }
}

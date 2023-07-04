package a0703;

public class Ex6_2 {
    public static void main(String[] args) {
        Tv1 t1 = new Tv1();
        Tv1 t2 = new Tv1();

        System.out.println("t1의 channel 값은 " + t1.channel + " 입니다.");
        System.out.println("t2의 channel 값은 " + t2.channel + " 입니다.");

        t1.channel = 7; // 채널 7로 바꿈
        t1.channelDown();
        System.out.println("t1의 channel 값을 7로 변경하였습니다.");
        System.out.println("t1의 channel 값은 " + t1.channel + " 입니다.");
        System.out.println("t2의 channel 값은 " + t2.channel + " 입니다.");
    }
}

class Tv1 {
    // Tv의 속성(멤버변수)
    String color;
    boolean power;
    int channel;

    // tv를 켜거나 끄는 메서드
    void power() {
        power = !power;
    }

    // tv 채널 올리는 메서드
    void channelUp() {
        ++channel;
    }

    // tv 채널 내리는 메서드
    void channelDown() {
        --channel;
    }
}
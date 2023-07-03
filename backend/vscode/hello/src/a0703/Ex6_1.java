package a0703;

public class Ex6_1 {
    public static void main(String[] args) {
        // static은 공용변수
        Tv t = new Tv();; // 인스턴스를 참조하기 위한 변수 t를 선언
        // t = new Tv(); // tv 인스턴스를 생성한다.
        // 위 두 줄은 Tv t = new Tv(); 로 합칠 수 있음

        t.channel = 7; // tv 인스턴스의 맴버변수 channel의 값을 7로 한다.
        t.channelDown(); // tv인스턴스의 메서드 channelDown을 호출.
        System.out.println("현재 채널은 : " + t.channel + " 입니당!");
    }
}

class Tv {
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
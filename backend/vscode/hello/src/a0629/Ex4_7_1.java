package a0629;

public class Ex4_7_1 {
    public static void main(String[] args) {
        int plus = 0;
        for (int i = 1; i <= 100; i++) {
            plus = plus + i;
        }
        // System.out.println("1부터 100까지 합계는 " + plus);
        System.out.printf("1부터 100까지의 합계는 %d 입니다. %n", plus);
    }
}

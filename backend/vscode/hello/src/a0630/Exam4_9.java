package a0630;

public class Exam4_9 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        int n1 = 0;
        for (int i = 0; i < 5; i++) {
            n1 = num % 10;
            sum += n1;
            num = num / 10;
        }
        System.out.println(sum);
    }
}

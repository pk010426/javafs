package a0630;

public class Exam4_3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j <= i; j   ++) {
                sum = sum + j;
            }
        }
        System.out.println(sum);
    }
}

package a0630;

public class Exam4_4 {
    public static void main(String[] args) {

        int i = -2, j = 3, sum = 1;
        while (true) {
            sum = sum + (i + j);

            if (sum >= 100) {
                System.out.println(i);
                System.out.println(j);
                System.out.println(sum);
                break;
            }

            i -= 2;
            j += 2;
        }

    }
}

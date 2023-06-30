package a0630;

public class Exam4_5 {
    public static void main(String[] args) {

        int i = 0, j = 0;
        while (i <= 10) {
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            j = 0;
            i++;
        }

        for (int a = 0; a <= 10; a++) {
            for (int b = 0; b <= a; b++)
                System.out.print("*");
            System.out.println();
        }
    }
}

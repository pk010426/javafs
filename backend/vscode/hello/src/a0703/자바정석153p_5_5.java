package a0703;

public class 자바정석153p_5_5 {
    public static void main(String[] args) {
        int[] ballarr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] ball3 = new int[3];

        for (int i = 0; i < ballarr.length; i++) {
            int j = (int) (Math.random() * ballarr.length);
            int tmp = 0;
            tmp = ballarr[j];
            ballarr[j] = ballarr[i];
            ballarr[i] = tmp;
        }
        ball3 = new int[] { ballarr[0], ballarr[1], ballarr[2] };

        for (int i =0; i <ball3.length; i++){
            System.out.print(ball3[i]);
        }
    }
}

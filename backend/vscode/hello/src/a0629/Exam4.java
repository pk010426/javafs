package a0629;

public class Exam4 {
    public static void main(String[] args) {

        while (true) {
            int dice1 = (int) (Math.random() * 6) + 1,
                    dice2 = (int) (Math.random() * 6) + 1;
            System.out.printf("(%d, %d)%n", dice1, dice2);
            if (dice1 + dice2 == 5) {
                System.out.print("합이 5인 숫자가 나왔습니다! ");
                System.out.printf("(%d, %d)", dice1, dice2);
                break;
            }
        }

    }
}

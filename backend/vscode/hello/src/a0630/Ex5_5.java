package a0630;

public class Ex5_5 {
    public static void main(String[] args) {
        int[] ball = new int[45];

        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }
        int tmp = 0;
        int j = 0;

        for (int i = 0; i < 6; i++) {
            j = (int) (Math.random() * 45);
            tmp = ball[i];
            //0번째 배열을 tmp 변수 저장
            System.out.println("tmp"+tmp);
            ball[i] = ball[j];
            // j는 ball[] 의 랜덤한 번째의 배열
            // 0번째 배열에 랜덤한 배열 대입.
            ball[j] = tmp;
            // 랜덤하게 바꾼 배열에 0번재 배열을 다시 대입
            // 이렇게 하면 배열의 순서를 바꾸는 거라 중복이 안나옴.

            // 결론 : 순서를 바꿔버리는 건 불가능
            // 1. 0번재 배열에 32(랜덤)번째 배열 대입
            // 2. 32번째 배열에 0번째 배열 대입
            // 3. 이러면 중복 안 나옴.
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(ball[i]);
        }

    }
}

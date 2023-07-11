package a0711;

public class MathExam {
    public static void main(String[] args) {
        // 큰 정수, 작은 정수
        double v1 = Math.ceil(5.3);
        double v2 = Math.floor(5.3);

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        // 큰 값, 작은 값
        long v3 = Math.max(3, 7);
        long v4 = Math.min(3, 7);

        System.out.println("v3 = " + v3);
        System.out.println("v4 = " + v4);
        // 소수점 이하 두 자리
        double value = 12.3456;
        double temp1 = value * 100;
        System.out.println(temp1);
        long temp2 = Math.round(temp1);
        System.out.println(temp2);

        double v5 = temp2 / 100.0;
        System.out.println("v5 = " + v5);

    }
}

package a0704;

public class CalculatorExam {
    public static void main(String[] args) {
        
        double result1 = 10 * 10 * Calculator.pi;
        int result2 = Calculator.plus(10, 5); // 정적 메서드, 클래스 메서드, 스태틱 메서드, 공용 메서드
        int result3 = Calculator.minus(10, 5);

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
    }
}

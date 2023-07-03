package a0703;

public class String2 {
    public static void main(String[] args) {
        String ssn = "010426-3123456";

        String firstNum = ssn.substring(0, 6);
        System.out.println(firstNum);

        String secondNum = ssn.substring(7);
        System.out.println(secondNum);
    }
}

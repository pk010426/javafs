package a0630;

public class Exam4_7 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0, num = 0;

        for (int i = 0; i < str.length(); i++) {
        num = Character.getNumericValue(str.charAt(i));
        sum += num;
        }
        System.out.println("sum = " + sum);

       
    }
}

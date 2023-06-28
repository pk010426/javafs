package a0628;

public class Ex3_16 {
    public static void main(String[] args) {
        boolean b = true;
        char ch = 'C';
        System.out.printf("b=%b%n", b);
        System.out.printf("!b=%b%n", !b);
        System.out.printf("!!b=%b%n", !!b);
        System.out.printf("!!!b=%b%n", !!!b);
        System.out.println();

        System.out.printf("ch = %c%n", ch);
        System.out.printf("ch < a || ch > 'z' = %b%n", ch < 'a' || ch > 'z');
        // 소문자 a는 아스키 코드값이 97, 대문자 C는 67이다.
        System.out.printf("!(a <= ch && ch <= 'z') = %b%n", !('a' <= ch && ch <= 'z'));
        System.out.printf("a <= ch && ch <= 'z' = %b%n", 'a' <= ch && ch <= 'z');
    }
}

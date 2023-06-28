package a0628;

public class Ex3_14 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc" == "abc");
        System.out.printf("str1==\"abc\" ? %b%n", str1 == "abc");
        System.out.printf("str2==\"abc\" ? %b%n", str2 == "abc");
        // str2가 abc를 가지고 있지만,
        System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
        System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
        System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
        // str1.equals("abc")는 str1이라는 주소가 가르키는 주소가 맞나 확인
        System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
        // equalsIgnoreCase는 대소문자 구분 무시
        System.out.println(str1);
        System.out.println(str2);
    }
}

package a0711;

public class Stringnuffer4 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("JAVA 만세!!");
        System.out.println("원본 문자열 : " + str);
        System.out.println(str.insert(4, "script"));
        System.out.println("메소드 호출 후 문자열 : " + str);

    }
}
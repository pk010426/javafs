package a0711;

public class Stringnuffer3 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("JAVA Oracle");
        System.out.println("원본 문자열 : " + str);

        System.out.println(str.delete(4, 8)); //4에서 8문자열 사라짐
        System.out.println(str.deleteCharAt(1));
        System.out.println("메소드 호출 후 문자열 : " + str);

    }
}
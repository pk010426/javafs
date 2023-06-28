package a0627;

public class Char2 {
    public static void main(String[] args) {
        int a = 65;
        int b = -66;

        char a2 = 65;
        // char b2 = -66; < 이거는 에러남
        char a3 = 97;
        System.out.println(a);
        System.out.println((char)a);
        System.out.println((char)b); //int b 는 -66이지만 문자 코드가 아님.
        //65는 아스키코드 A, -66은 아스키코드가 없음
        System.out.println((char)a2);
        System.out.println((char)a3);
    }
}

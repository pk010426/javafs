package a0711;

public class Wrapper1 {
    public static void main(String[] args) {
        // Integer num = new Integer(17) - java 8 방식;  // 박싱
        Integer num = Integer.valueOf(17);
        int n = num.intValue(); // 언박싱
        System.out.println(n);

        Character ch = 'X';
        char c = ch;
        System.out.println(c);
    }
}

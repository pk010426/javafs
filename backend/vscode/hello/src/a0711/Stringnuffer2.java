package a0711;

public class Stringnuffer2 {
    public static void main(String[] args) {
        StringBuffer str01 = new StringBuffer("JAVA");
        StringBuffer str02 = new StringBuffer("JAVA");
        System.out.println(str01.capacity());
        System.out.println(str02.capacity());
    }
}
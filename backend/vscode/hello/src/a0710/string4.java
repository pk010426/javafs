package a0710;

public class string4 {
    public static void main(String[] args) {
        String str= new String("Oracle Jave");
        System.out.println("문자열" + str);

        System.out.println(str.indexOf('o'));
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf("Jave"));
        System.out.println("indexOf() 메소드 호추 후 원본 문자열" + str);
    }
}

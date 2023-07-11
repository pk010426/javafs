package a0711;

public class Stringnuffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("JAVA");
        System.out.println("원본 문자열 : " + str);

        System.out.println(str.append("수업"));
        System.out.println("appdne() 메소드 호출 후 원본 문자열 : " + str);
    
}
}
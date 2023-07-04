package a0704.static_class;

public class ex {
    public static void main(String[] args) {
        // System.out.println(cat.name);
        cat12345 cat1 = new cat12345();

        System.out.println(cat1.name);
        System.out.println(cat12345.color);
        System.out.println(cat12345.plus(5, 7));
        System.out.println(cat12345.sp("고먐미"));
        
    }
}

class cat12345 {
    String name = "흰냥이";
    static String color = "white";

    static int al(int a, int b) {
        return a + b;
    }

    static String sp(String s) {
        return s;
    }

    static int plus(int x, int y) {
        return x + y;
    }
}

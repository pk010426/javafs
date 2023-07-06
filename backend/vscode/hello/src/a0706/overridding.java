package a0706;

public class overridding {
    public static void main(String[] args) {
        dog1 d1 = new dog1("멍이", "말티즈");
        d1.bow("컹");
    }
}

class dog {
    String dName;
    String spice;
    int a = 2;

    void bow(String s) {
        System.out.println("멍멍" + s);
    }

    dog(String n, String sp) {
        dName = n;
        spice = sp;
    }
}

class dog1 extends dog {
    dog1(String n, String sp) {
        super(n, sp);
        dName = n;
        spice = sp;
    }

    void bow(String s) {
        System.out.println(dName);
        System.out.println(spice);
        System.out.println("멍멍" + s);
        System.out.println(12345155);
    }
}
package a0706;

public class overloading {
    public static void main(String[] args) {
        over1 exover = new over1();
        exover.ov();
        exover.ov(5);
        exover.ov("떡냥이");
    }
}

class over1 {
    String cat;
    int c;

    void ov() {
        System.out.println(cat);
    }

    void ov(int a) {
        c = a;
        System.out.println(c);
    }

    void ov(String b) {
        cat =b;
        System.out.println(cat);
    }
}

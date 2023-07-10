package a0707.추상클래스;

public class smartphone extends phone {
    smartphone(String owner) {
        super(owner);
    }

    void search() {
        System.out.println("검색");
    }
}

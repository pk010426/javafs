package a0710;

public class main1 implements dog, cat {
    public static void main(String[] args) {
        main1 main = new main1();
        main.crying();
        main.one();
        main.two();
    }

    @Override
    public void crying() {
        System.out.println("멍");
    }

    @Override
    public void one() {
        System.out.println("one");
    }

    @Override
    public void two() {
        System.out.println("two");
    }

}

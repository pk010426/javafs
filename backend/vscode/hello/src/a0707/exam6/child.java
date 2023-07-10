package a0707.exam6;

public class child extends parent {
    public String name;

    public child() {
        this("홍씨");
        System.out.println("chile() call");
    }

    public child(String name) {
        this.name = name;
        System.out.println("child(string name) call");
    }
}
package a0707.exam6;

public class parent {
    public String nation;
    public parent() {
        this("대한민국");
        System.out.println("parent() call");
    }
    public parent(String nation) {
        this.nation = nation;
        System.out.println("parent(string nation) call");
    }
}

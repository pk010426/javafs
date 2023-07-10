package a0707;

public class Main10 {
    public static void main(String[] args) {
        Archer ar1 = new Archer("로빈후드", "상");
        Archer ar2 = new Archer("로빈후드", "상");
        System.out.println(ar1 == ar2);
        System.out.println(ar1.equals(ar2));
    }
}

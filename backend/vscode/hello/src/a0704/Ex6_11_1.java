package a0704;

public class Ex6_11_1 {
    public static void main(String[] args) {
        Cars c1 = new Cars("white", "auto", 4);
        Cars c2 = new Cars("red", "auto", 4);

        System.out.println(c1.color);
        System.out.println(c1.gearType);
        System.out.println(c1.door);
        System.out.println();
        System.out.println(c2.color);
        System.out.println(c2.gearType);
        System.out.println(c2.door);
    }
}

class Cars {
    String color;
    String gearType;
    int door;
    
    Cars(String c, String g, int d) {
        color =  c;
        gearType = g;
        door = d;
    }
}
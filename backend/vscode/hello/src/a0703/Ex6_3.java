package a0703;

public class Ex6_3 {
    public static void main(String[] args) {
        System.out.println("Card.width = " + card.width);
        System.out.println("Card.height = " + card.height);

        card c1 = new card();
        c1.kind = "heart";
        c1.num = 9;

        card c2 = new card();
        c2.kind = "spade";
        c2.num = 2;

        System.out.println("c1은 " + c1.kind + c1.num + "이며, 크기는(" + c1.width + ", " + c1.height + ")");
        System.out.println("c2은 " + c2.kind + c2.num + "이며, 크기는(" + c2.width + ", " + c2.height + ")");

        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다!");
        c1.width = 80;
        c1.height = 50;
        System.out.println("c1은 " + c1.kind + c1.num + "이며, 크기는(" + c1.width + ", " + c1.height + ")");
        System.out.println("c2은 " + c2.kind + c2.num + "이며, 크기는(" + c2.width + ", " + c2.height + ")");
        
    }
}

class card {
    // 스태틱은 공용이다. 하나만 바뀌어도 다 바뀜 c1.width = 10; 이면, c2의 넓이도 10이 된다.
    String kind;
    int num;
    static int width = 100;
    static int height = 250;
}
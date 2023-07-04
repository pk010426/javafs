package a0704.static_class;

public class cat1234 {
    public static void main(String[] args) {
        cats cat1 = new cats("코숏", "검정", 5);
        cats cat2 = new cats("치즈코숏", "노랑", 8);
        cats cat3 = new cats("아메리칸숏헤어", "회색", 1);
        cats cat4 = new cats("러시안블루", "파랑", 12);
        
        System.out.println(cat1.spice);
        System.out.println(cat1.color);
        System.out.println(cat2.color);
        System.out.println(cat1.age);
        System.out.println(cat4. spice);
    }

}

class cats {
   final String spice;
   final String color;
   final int age;

    cats(String s, String c, int a) {
        spice = s;
        color = c;
        age = a;
    }
}

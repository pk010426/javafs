package a0705;

public class Members{
    public static void main(String[] args) {
        Member user1 = new Member("김길동", "kim");
        System.out.println(user1.name);
        System.out.println(user1.id);
    }
}

class Member {
    String name;
    String id;
    String password;
    int age;

    Member(String n, String i) {
        name = n;
        id = i;
    }
}

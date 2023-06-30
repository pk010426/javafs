package a0630;

public class Ex5_6 {
    public static void main(String[] args) {
        String[] names = { "kim", "park", "yi" };

        for (int i = 0; i < names.length; i++) {
            System.out.println("names[" + i + "] : " + names[i]);
        }

        String tmp = names[2];
        System.out.println("tmp : " + tmp);
        names[0] = "yu";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}

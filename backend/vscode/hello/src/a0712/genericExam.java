package a0712;

public class genericExam {
    public static void main(String[] args) {
        box<String> box1 = new box<>();
        box1.content = "안녕하세요";
        String str = box1.content;
        System.out.println(str);

        box<Integer> box2 = new box<>();
        box2.content = 100;
        int value = box2.content;
        System.out.println(value);
    }
}

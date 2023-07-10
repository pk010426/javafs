package a0707;

public class Student extends Person{
    public int studentNO;

    public Student(String name, int studentNO) {
        super(name);
        this.studentNO = studentNO;
    }

    public void study() {
        System.out.println("공부");
    }
}

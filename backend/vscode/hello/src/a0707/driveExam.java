package a0707;

public class driveExam {
    public static void main(String[] args) {
        driver dv = new driver();

        bus bs = new bus();
        dv.drive(bs);
        taxi tx = new taxi();
        dv.drive(tx);
    }
}

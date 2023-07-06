package a0706;

public class ComputerExam {
    public static void main(String[] args) {
        int r =10;
        Caculator caculator =new Caculator();
        System.out.println("원 면적 : " + caculator.areaCicle(r));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원 면적 : " + computer.areaCicle(r));
        
    }
}

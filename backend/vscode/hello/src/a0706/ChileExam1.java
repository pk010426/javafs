package a0706;

public class ChileExam1 {
    public static void main(String[] args) {
        Parant1 parant1 = new Child1();

        parant1.field1 = "data1";
        parant1.methoe_1();
        parant1.methoe_2();

        //불가능
        // parant1.field2 = "data2";
        // parant1.methoe_3();

        Child1 child1 = (Child1) parant1;
        
        // 강제 형변환으로 가능
        child1.field2 = "data2";
        child1.methoe_3();

    }
}

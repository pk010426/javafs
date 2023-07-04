package a0704;

public class KoreanExam {
    public static void main(String[] args) {
        // 객체 생성 시 주민등록번호와 이름 전달
        Korean k1 = new Korean("123456-1234567", "김자바");
        // 필드값 읽기
        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);
        // final은 값을 변경할 수 없음
        // k1.nation = "usa";
        System.out.println(k1.nation);
        
    }
}

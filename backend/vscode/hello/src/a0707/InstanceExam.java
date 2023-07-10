package a0707;

import a0705.StudentTest;

public class InstanceExam {
    public static void personInfo(Person person) {
        System.out.println("name " + person.name);
        person.walk();
        if (person instanceof Student) {
            Student student = (Student) person;
            System.out.println("스튜던트 넘 : " + student.studentNO);
            student.study();
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("김씨");
        personInfo(p1);

        System.out.println();

        Person p2 = new Student("오씨", 22);
        personInfo(p2);
        // 1. Person 객체 정보 출력
        // 2. Student 객체 정보 출력
        // 3. 이때 Student 객체는 Person 클래스를 상속 받았기 때문 'personIno()' 메서드에서 instanceop 연선자를 이용해 studnt 타입인지 확인
        // 4. 필요에 따라 형변환 하여 sutdent클래스만 존재하느 필드와 메서드를 사용 가능
    }
}

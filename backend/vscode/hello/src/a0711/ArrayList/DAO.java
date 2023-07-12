package a0711.ArrayList;

import java.lang.reflect.Array;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Scanner;

import a0712.product;

public class DAO {
    Scanner sc = new Scanner(System.in);
    private ArrayList<MemberDTO> mlist;
    private FileClass file = new FileClass("sun", "memberInfo");

    public DAO() {
        mlist = new ArrayList<MemberDTO>();
        MemberDTO m1 = new MemberDTO(0, "test1", 11, "서울");
        MemberDTO m2 = new MemberDTO(0, "test2", 22, "대전");
        MemberDTO m3 = new MemberDTO(0, "test3", 33, "대구");
        MemberDTO m4 = new MemberDTO(0, "test4", 44, "부산");
        mlist.add(m1);
        mlist.add(m2);
        mlist.add(m3);
        mlist.add(m4);
    }

    private void insert(MemberDTO m) {
        mlist.add(m);
    }

    private MemberDTO select(int index) {
        return mlist.get(index);
    }

    private void update(int index, MemberDTO m) {
        mlist.set(index, m);
    }

    private void delete(int index) {
        mlist.remove(index);
    }

    public void printAll() {
        System.out.println("전체 회원 목록");
        int index = 1;
        for (int i = 0; i < mlist.size(); i++) {
            System.out.println(index + mlist.get(i).getName() + "회원");
            System.out.println("회원번호 : " + mlist.get(i).getId());
            System.out.println("나이 : " + mlist.get(i).getAge());
            System.out.println("주소 : " + mlist.get(i).getAddress());
            index++;
        }
    }

    private int findIndex() {
        System.out.println("회원 이름을 입력하세요");
        String name = sc.next();
        for (int i = 0; i < mlist.size(); i++) {
            if (mlist.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    // user 메소드 : 사용자 입력값 있음
    public void userInsert() {
        MemberDTO m = new MemberDTO();
        System.out.println("회원정보입력");
        System.out.print("회원번호");
        int id = sc.nextInt();
        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        System.out.print("주소 : ");
        String ad = sc.next();

        m.setId(id);
        m.setAge(age);
        m.setName(name);
        m.setAddress(ad);
        insert(m);
    }

    // 유저 삭제

    public void userDelete() {
        int index = findIndex();
        if (index != -1) {
            delete(index);
            System.out.println("회원삭제!");
        } else {
            // 이름 없는경우
            System.out.println("회원이 읎어요");
        }
    }

    public void userSelect() {
        int index = findIndex();
        if (index != -1) {
            MemberDTO m = select(index);
            int id = m.getId();
            int age = m.getAge();
            String name = m.getName();
            String address = m.getAddress();

            System.out.println("< " + name + "의 회원정보 >");
            System.out.println("회원번호 : " + id);
            System.out.println("이름 : " + name);
            System.out.println("나이 : " + age);
            System.out.println("주소 : " + address);

        } else {
            System.out.println("회원이 없어요");
        }
    }

    public void userUpdate() {
        int index = findIndex();
        if (index != -1) {
            MemberDTO m = select(index);
            m.setId(mlist.get(index).getId());
            m.setName(mlist.get(index).getName());
            m.setId(mlist.get(index).getId());
            m.setId(mlist.get(index).getId());
            System.out.println("< " + m.getName() + " 회원 정보 수정 >");
            System.out.println("회원 번호 : " + m.getId());
            System.out.print("나이 : ");
            m.setAge(sc.nextInt());
            System.out.print("주소 : ");
            m.setAddress(sc.next());

            update(index, m);
            System.out.println("수정 완료~!");

        } else {
            System.out.println("회원은 존재 x 없어요");
        }
    }

    public void dataSave() throws Exception {
        file.create();
        String str = "번호\t 이름\t 나이\t 주소\n" +
                "-----------------------------\n";
        for (int i = 0; i < mlist.size(); i++) {
            str+= mlist.get(i).toString()+"\n";
        }
        System.out.println("데이터 저장 완료");
        file.write(str);
    }

    public void dataLoad() {
        try {
            file.read();
        } catch (Exception e) {
            System.out.println("읽을 파일이 없으요");
        }
    }
}
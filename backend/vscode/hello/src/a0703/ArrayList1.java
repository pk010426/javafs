package a0703;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        // add() 메소드를 이용한 요소 저장
        arrayList.add(40);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(10);
        System.out.println(arrayList);

        // for문과 get() 메소드를 이용한 요소의 출력
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        // remove로 제거 가능
        System.out.println("배열 1제거");
        arrayList.remove(1);
        System.out.println(arrayList.get(1));
        // Enhanced for문과 get() 메소드를 이용한 요소의 출력
        for (int e : arrayList) {
            // arrayList 는 ArrayList 객체를 가리키는 변수
            // Enhanced for문을 사용하여 'arrrList'의 모든 요소를 순회함
            // 순회하면서 각 요소를 'e' 라는 변수에 저장함.
            System.out.print(e + " ");
        }
        System.out.println(" ");

        // Collections.sort() 메소드를 이용한 요소의 정렬
        Collections.sort(arrayList);

        // iterator() 메소드와 get() 메소드를 이용한 요소의 출력
        Iterator<Integer> iter = arrayList.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();

        // set() 메소드를 이용한 요소의 변경
        arrayList.set(0, 20);

        for (int e : arrayList) {
            System.out.print(e + " ");
        }
        System.out.println();

        // size() 메소드를 이용한 요소의 총 개수
        System.out.println("리스트의 크기 : " + arrayList.size());

    }
}
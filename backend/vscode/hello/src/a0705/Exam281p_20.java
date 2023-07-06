package a0705;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam281p_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> aclist = new ArrayList<>();
        ArrayList<String> culist = new ArrayList<>();
        ArrayList<Integer> balist = new ArrayList<>();
        int acNum = 0;
        int chose = 0;
        boolean run = true;
        while (true) {
            System.out.println("------------------------------------------------------");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4.출금 | 5. 종료");
            System.out.println("------------------------------------------------------");
            System.out.print("메뉴를 입력하세요. > ");
            chose = sc.nextInt();
            if (chose == 1) {
                System.out.println("계좌 6자리 입력");
                // 숫자 6자리를 입력했나 확인하는 if문
                while (run) {
                    if (sc.hasNextInt()) {
                        acNum = sc.nextInt();
                        if (acNum / 100000 >= 1 && acNum / 100000 <= 9) {
                        } else {
                            System.out.println("6자리수로 입력하세요.");
                            continue;
                        }
                    } else {
                        String no = sc.nextLine();
                        String no1 = sc.nextLine();
                        System.out.println("계좌번호가 될 숫자 6자리를 다시 입력하세요");
                        continue;
                    }
                    String a = Integer.toString(acNum);
                    String a1 = a.substring(0, 3);
                    String a2 = a.substring(3, 6);
                    String ac = a1 + "-" + a2;
                    boolean contains = aclist.contains(ac);

                    if (contains) {
                        System.out.println("이미 있는 계좌입니다! 다시 생성");
                        continue;
                    }

                    System.out.println("계좌주를 입력하세요.");
                    // 스캐너 오류로 인해 넣은 의미 없는 스캐너
                    String dummy = sc.nextLine();
                    // 계좌주 입력
                    String cu = sc.nextLine();

                    aclist.add(ac);
                    culist.add(cu);
                    System.out.println("계좌 생성 완료");

                    System.out.println("초기 입금액을 숫자로 입력하세요");
                    int ba = sc.nextInt();
                    balist.add(ba);
                    System.out.printf("계좌번호 : %s | 계좌주 : %s | 초기 입금액 : %d원\n", ac, cu, ba);
                    run = false;
                }
            } else if (chose == 2) {
                System.out.println("--------");
                System.out.println("계좌목록");
                System.out.println("--------");
                for (int i = 0; i < aclist.size(); i++) {
                    System.out.printf("%s | %s | %d\n", aclist.get(i), culist.get(i), balist.get(i));
                }
            } else if (chose == 3) {
                System.out.println("--------");
                System.out.println("  예금  ");
                System.out.println("--------");
                System.out.println("계좌번호 6자리를 입력하세요 ex) 123-456");
                String dummy2 = sc.nextLine();
                String acLoad = sc.nextLine();
                int loadac = aclist.indexOf(acLoad);
                if (loadac == -1) {
                    System.out.println("없는 계좌입니다!");
                    continue;
                }
                System.out.printf("%s | %s | %d\n", aclist.get(loadac), culist.get(loadac), balist.get(loadac));
                System.out.println("얼마를 예금하시겠습니까?");
                int saveBa = sc.nextInt();
                if (saveBa < 0) {
                    System.out.println("-는 입금 불가입니다!");
                } else {
                    balist.set(loadac, balist.get(loadac) + saveBa);
                }
                System.out.println("통장 잔액 : " + balist.get(loadac));
            } else if (chose == 4) {
                System.out.println("--------");
                System.out.println("  출금  ");
                System.out.println("--------");
                System.out.println("계좌번호 6자리를 입력하세요 ex) 123-456");
                String dummy2 = sc.nextLine();
                String acLoad = sc.nextLine();
                int loadac = aclist.indexOf(acLoad);
                if (loadac == -1) {
                    System.out.println("없는 계좌입니다!");
                    continue;
                }
                System.out.printf("%s | %s | %d\n", aclist.get(loadac), culist.get(loadac), balist.get(loadac));
                System.out.println("얼마를 출금하시겠습니까?");
                int saveBa = sc.nextInt();
                if (saveBa < 0) {
                    System.out.println("-는 출금 불가입니다!");
                } else {
                    if (balist.get(loadac) < saveBa) {
                        System.out.println("출금 금액이 더 큽니다!");
                        continue;
                    }
                    balist.set(loadac, balist.get(loadac) - saveBa);
                }
                System.out.println("통장 잔액 : " + balist.get(loadac));
            } else if (chose == 5) {
                System.out.println("앱을 종료합니다. 이용해주셔서 감사합니다.");
                break;
            }
            run = true;
        }
    }
}
package a0706;

import java.util.Scanner;

public class Bank {
    private static Account[] accountArray = new Account[100];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("------------------------------------------------------");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4.출금 | 5. 종료");
            System.out.println("------------------------------------------------------");
            System.out.print("메뉴를 입력하세요. > ");
            int chose = sc.nextInt();

            if (chose == 1) {
                createAccount();
            } else if (chose == 2) {
                accountList();
            } else if (chose == 3) {
                deposit();
            } else if (chose == 4) {
                withdraw();
            } else if (chose == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }

    private static void createAccount() {
        System.out.println("------------");
        System.out.println("  계좌생성  ");
        System.out.println("------------");
        System.out.println("계좌번호");
        String ano = sc.next();
        System.out.println("계좌주");
        String owner = sc.next();
        System.out.println("초기입금액");
        int balance = sc.nextInt();
        Account newAccount = new Account(ano, owner, balance);

        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                accountArray[i] = newAccount;
                System.out.println("계좌생성 완료");
                break;
            }
        }
    }

    private static void accountList() {
        System.out.println("------------");
        System.out.println("  계좌목록  ");
        System.out.println("------------");
        for (int i = 0; i < accountArray.length; i++) {
            Account account = accountArray[i];
            if (account != null) {
                System.out.print(account.getAno());
                System.out.println("    ");
                System.out.print(account.getOwner());
                System.out.println("    ");
                System.out.print(account.getBalance());
                System.out.println("    ");
            }
        }
    }

    private static void deposit() {
        System.out.println("------------");
        System.out.println("  계좌목록  ");
        System.out.println("------------");
        System.out.println("계좌번호");
        String ano = sc.next();
        System.out.print("예금액 : ");
        int money = sc.nextInt();
        Account account = findAccount(ano);
        if (account == null) {
            System.out.println("결과 : 계좌 없음");
            return;
        }
        account.setBalance(account.getBalance() + money);
        System.out.println("결과 : 예금 성공");
    }

    private static Account findAccount(String ano) {
        Account account = null;
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] != null) {
                String dbAno = accountArray[i].getAno();
                if (dbAno.equals(ano)) {
                    account = accountArray[i];
                    break;
                }
            }
        }
        return account;
    }

    private static void withdraw() {
        System.out.println("------------");
        System.out.println("  계좌목록  ");
        System.out.println("------------");
        System.out.println("계좌번호");
        String ano = sc.next();
        System.out.print("출금액 : ");
        int money = sc.nextInt();
        Account account = findAccount(ano);
        if (account == null) {
            System.out.println("결과 : 계좌 없음");
            return;
        }
        account.setBalance(account.getBalance() - money);
        System.out.println("결과 : 출금 성공");
    }
}

package a0705;

public class AccountTest1 {
    public static void main(String[] args) {
        Account1 a = new Account1("123-45", 10000);
        Account1 b = new Account1("567-89", 10000);
        while (a.transfer(b, 3000)) {
            // a계좌에서 b계좌로 송금하라
            // while 루프를 이용해서 a 계좌에서 b계좌로 3000원을 송금해라
            // a 계좌의 금액이 부족할 때까지.
        }
        System.out.println(a.toStr());
        System.out.println(b.toStr());
    }
}

class Account1 {
    String num;
    int balance;

    public Account1(String n, int b) {
        num = n;
        balance = b;
    }

    public boolean transfer(Account1 ac1, int am1) {
        if (balance < am1) {
            return false;
        }
        balance -= am1; // 출금 계좌 a의 금액
        ac1.balance += am1; // 입금 계좌 b의 금액
        return true;
    }

    public String toStr() {
        return String.format("Account {num : %s, balance : %d\n}", num, balance);
    }
}

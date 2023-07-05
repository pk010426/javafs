package a0705;

public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(1000);
        System.out.printf("잔액 : %d",acc.getBalance());
    }
}

class Account {
    private int balance;

    public void setBalance(int b) {
        balance = b;
    }

    public int getBalance() {
        return balance;
    }

    // 게터 메소드
    // public int getBalance() {
    // return balance;
    // }

    // // 세터 메소드
    // public void setBalance(int b) {
    // balance = b;
    // }
}

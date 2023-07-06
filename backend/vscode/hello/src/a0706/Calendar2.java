package a0706;

import java.util.Calendar;

public class Calendar2 {
    public static void main(String[] args) {
        Calendar time = Calendar.getInstance();

        int year = time.get(Calendar.YEAR);
        // 월은 0부터 시작해서 1더해야 함
        int month = time.get(Calendar.MONTH) + 1;
        int day = time.get(Calendar.DAY_OF_MONTH);
        System.out.println("Current Date : " + year + " - " + month + " - " + day);
    }
}

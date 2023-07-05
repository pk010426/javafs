package a0705;

import java.util.Calendar;

public class WeekExam {
    public static void main(String[] args) {
        Week today = null;

        Calendar cal = Calendar.getInstance();

        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch (week) {
            case 1:
                today = Week.SUNDAY;
                break;
            case 2:
                today = Week.MONDAY;
                break;
            case 3:
                today = Week.TUESDAY;
                break;
            case 4:
                today = Week.WEDNESDAY;
                break;
            case 5:
                today = Week.THURSDAY;
                break;
            case 6:
                today = Week.FRIDAY;
                break;
            case 7:
                today = Week.SATURDAY;
                break;
        }
        System.out.println(week);
        System.out.println(today);
        if (today == Week.SUNDAY) {
            System.out.println("오늘은 게임하며 쉴거임");
        } else {
            System.out.println("오늘은 프로그래밍 공부");
        }
    }
}

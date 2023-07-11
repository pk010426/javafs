package a0711;

import java.util.regex.Pattern;

public class PatternExam {
    public static void main(String[] args) {
        String regExp = "(02|010)-\\d{3,4}-\\d{4}";
        String data = "010-123-4567";
        boolean result = Pattern.matches(regExp, data);
        if(result) {
            System.out.println("정규식 일치");
        } else {
            System.out.println("정규식 불일치");
        }

        regExp ="\\w+@\\w+\\.\\w+(\\.\\w+)?";
        data = "angel@mycompanycom";
        result = Pattern.matches(regExp, data);
        if(result) {
            System.out.println("정규식 일치");
        } else {
            System.out.println("정규식 불일치");
        }
    }
}

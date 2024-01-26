package learning_exp.java;

public class variable {
    public static void main(String[] args) {
        /*
        text -> String or char
        Char represents one letter and must use single quotation marks.
        number -> int or long
        Long represents a number greater than ten billion and should be put l at the end.
        float -> float or double
        Float represents a decimal point less than double and up to six decimal place.
        Boolean represents true or false.
        */ 
        String value = "Test";
        int count = 3;
        long count2 = 10_000_000_000l;
        double round = 3.14;
        float round2 = 3.15f;
        char oneString = '가';
        boolean check = true;
        final String NOT_CHANGE = "변하지 않음";
        // How to use each variable when using the format.
        System.out.println(String.format(
            "상수: %s 글자: %s 숫자: %d 또는 %d 실수: %.2f 또는 %.2f 한글자: %s 조건: %b", 
            NOT_CHANGE, value, count, count2, round, round2, oneString, check));
        // The valiable is change but The constants is not change
        value = "Test에서 테스트로";
        System.out.println(String.format("글자 변경: %s", value));
        /* 
        type casting 
        int -> float
        float -> int
        When changing type of valiable, you must put the type before it.
         */
        System.out.println(String.format("숫자에서 실수로 변환: %.2f 실수에서 숫자로 변환: %d", 
        (float) count, (int) round));
        /*
        other valiable -> string
        If you want to change from int to string, you have to write in the form Interger.toString(valiable).
        If you want to change from other type except to int to string, you have to wirte in the form String.valueOf(valiable). 
         */
        System.out.println(String.format("숫자에서 문자로 변환: %s 불리언에서 문자로 변환: %s", 
        Integer.toString(count), String.valueOf(check)));
        /*
        string -> int
        Write in the form Interger.parseInt(valiable).
         */
        String text = "67";
        System.out.println(String.format("문자에서 숫자로 변환: %s", Integer.parseInt(text)));
    }
}

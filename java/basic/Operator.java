package basic;
public class Operator {
    public static void main(String[] args) {
        boolean one = true;
        boolean two = false;
        boolean three = true;
        boolean four = false;
        /*
        Binary operator
         one(true) or three(true) -> true
         one(true) or two(false) -> true
         one(true) and two(false) -> false
         one(true) and three or not two(false) and not four(false) -> true
         */
        System.out.println(one || three);
        System.out.println(one || two);
        System.out.println(one && four);
        System.out.println(one && three || ! two && ! four);
        /*
         the three-term operator
         result = (condition)? (Result value if true):(Result value if false)
         */
        final String A = "참입니다.";
        final String B = "거짓입니다.";
        System.out.println((one)? A : B);
        System.out.println((two)? A : B);
    }
}

package basic;
public class MethodUse {
    // Void method is not return.
    // Java's method has a limited number of parameters.
    public static void Hello() {
        System.out.println("안녕하세요");
    }
    // Static method is the same with python's staticmethod.
    //  Type of the front part of the method name mean return's type.
    public static int Add(int num) {
        int sum = num + 2;
        return sum;
    }
    // overloading is the same method name but 
    public static String Add(String str) {
        String sum = str + "2";
        return sum;
    }
    public static void main(String[] args) {
        Hello();
        System.out.println(Add(5));
        System.out.println(Add("5"));
        
    }
}

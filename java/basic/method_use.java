package learning_exp.java.basic;


public class method_use {
    // Void method is not return.
    // Java's method has a limited number of parameters.
    public static void hello() {
        System.out.println("안녕하세요");
    }
    // Static method is the same with python's staticmethod.
    //  Type of the front part of the method name mean return's type.
    public static int add(int num) {
        int sum = num + 2;
        return sum;
    }
    // overloading is the same method name but 
    public static String add(String str) {
        String sum = str + "2";
        return sum;
    }
    public static void main(String[] args) {
        hello();
        System.out.println(add(5));
        System.out.println(add("5"));
        
    }
}

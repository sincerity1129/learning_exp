package learning_exp.java;

public class ifandfor {
    public static void main(String[] args) {
        // basic if
        boolean truth = true;
        boolean lie = false;
        if(truth){
            System.out.println("사실입니다.");
        }
        if(! lie){
            System.out.println("거짓입니다.");
        }
        // basic for
        for (int i=0; i<10; i++){
            System.out.println(String.format("Index: %d", i));
        }
        int ranges = 5;
        for (int i=0; i<ranges; i++){
            System.out.println(String.format("Index: %d", i));
        }
    }
}
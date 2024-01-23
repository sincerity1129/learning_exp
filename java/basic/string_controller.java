package learning_exp.java.basic;

public class string_controller {
    public static void main(String[] args) {
        String sentence = "I'm learning java about string controller.";
        // How to know text's length.
        System.out.println(sentence.length());
        // How to change uppercase and lowercase letters.
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());
        // To see if a sentance contains a word.
        System.out.println(sentence.contains("you"));
        System.out.println(sentence.contains("controller."));
        // If a part of a word contains, it is judge ture.
        System.out.println(sentence.contains("ller"));
        // If you want to check index of words in a sentencek, you put valiable.indexOf(word).
        // Index represents the first positon of a word.
        System.out.println(sentence.indexOf("ller"));
        System.out.println(sentence.indexOf("가"));
        // If you want to check finally index of any words, you put valiable.lastIndexOf(word).
        System.out.println(sentence.lastIndexOf("a"));
        // If you want to check start word or end word, you put valiable.satrtWith(word) or valiable.endWith(word)
        System.out.println(sentence.startsWith("I'm")); // true
        System.out.println(sentence.startsWith("Im")); // false
        System.out.println(sentence.endsWith("controller.")); // true
        System.out.println(sentence.endsWith("controller")); // false
    }   
}

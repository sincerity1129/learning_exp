package learning_exp.java.basic;

import java.util.ArrayList;
import java.util.HashMap;

public class arrays {
    public static void main(String[] args) {
        // basic array
        // why do array use?
        // fixed size, data type same, direct index get, fast
        String[] animals = {"cat", "dog", "elephant", "tiger", "lion"};
        System.out.println(animals[0]);
        System.out.println(animals.length);
        //basic list
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("a");
        list.add("true");
        System.out.println(list);
        // basic hashmap
        HashMap<String, String> testMap = new HashMap<>();
        testMap.put("사과", "1000원");
        testMap.put("배", "2000원");
        testMap.put("귤", "3000원");
        System.out.println(testMap);
        System.out.println(testMap.get("사과"));
        testMap.put("배", "2500원 인상");
        System.out.println(testMap);
    }    
}

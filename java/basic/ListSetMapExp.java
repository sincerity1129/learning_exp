package basic;
import java.util.*;

public class ListSetMapExp {
    public static LinkedList<String> LinkedList(String... features) {
        LinkedList<String> myLinkedList = new LinkedList<>();
        for(String feature:features) {
            myLinkedList.add(feature);
        }
        return myLinkedList;
    }

    public static ArrayList<String> ArrayList(String... features) {
        ArrayList<String> myArrayList = new ArrayList<>();
        for(String feature:features) {
            myArrayList.add(feature);
        }
        return myArrayList;
    }

    public static  HashSet<String> HashSet(String... features) {
        HashSet<String> mySet = new HashSet<>();
        for(String feature:features) {
            mySet.add(feature);
        }
        return mySet;
    }

    // basic HashMap
    public static void HashMap(HashMap<String, Object> features) {
        for(HashMap.Entry<String, Object> feature : features.entrySet()){
            System.out.println(String.format(
                "Key: %s\nValue: %s", feature.getKey(), feature.getValue()));
        }
    }
    // basic upgrade HashMap
    public static HashMap<String, Object> HashMap(String... features) {
        HashMap<String, Object> myDictionary = new HashMap<>();
        for  (String feature: features){
            myDictionary.put(feature,String.format(" %s입니다.", feature));
        }
        return myDictionary;
        
    }

    public static void main(String[] args) {
        System.out.println("ArrayList: "+ArrayList("a","b","a","b","c"));
        System.out.println("LinkedList: "+LinkedList("a","b","a","b","c"));
        System.out.println("Set: "+ HashSet("a","b","a","b","c"));
        //Use Lambda to import features.
        HashSet("a","b","a","b","c").forEach(feature -> System.out.println(feature));
        // HashMap<String, Object> myDictionary = new HashMap<>();
        // myDictionary.put("1", "일입니다.");
        // myDictionary.put("2", "이입니다.");
        // myDictionary.put("3", "삼입니다.");
        // myDictionary.put("4", "사입니다.");
        // HashMap(myDictionary);
        HashMap<String ,Object> myDIct = HashMap("1", "2", "3", "4");
        // dict key -> value parsing
        System.out.println(myDIct.get("1"));

    }
}

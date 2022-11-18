package study;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest_1 {
    public static void main(String[] args) {
        Map<String, Integer> mapTest = Map.of("사과", 5,  "바나나", 3, "포도", 2, "딸기", 1);
        Map<String, Integer> fruits = new HashMap<>(mapTest);

        fruits.put("귤", 2);

        for(Map.Entry<String, Integer> entrySet : fruits.entrySet()){
            System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
        }
    }
}

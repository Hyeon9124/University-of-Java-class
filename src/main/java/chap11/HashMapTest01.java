package chap11;

import java.util.HashMap;
import java.util.Map;

/** [1] map.entrySet() **/

public class HashMapTest01 {
    public static void main(String[] args) {

        Map<String, Integer> map = Map.of("사과", 5, "바나나", 3, "포도", 2, "딸기", 1);
        // of 메소드를 이용해서 최대 10개까지 만들 수 있음.

        Map<String, Integer> fruits = new HashMap<>(map); // map 데이터를 fruits에 가져옴
        fruits.put("귤", 2); // fruits에 "귤", 2 데이터를 입력

        // foreach 사용
        for(Map.Entry<String, Integer> entrySet : fruits.entrySet()){ // entrySet()으로 Map에 있는 데이터를 가져온다.
            // entrySet은 변수이므로 result, entry 등등 아무거나 사용해도 상관없음
            System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
            // getKey(), get.Value()를 사용하여 entrySet 값을 출력
            // 순서는 상관 없음.
        }
        System.out.println();
        // Set<Map.Entry<K, V>> entrySet() : 모든 Key-Value 값을 Set 타입으로 반환한다.
        
        /** Lambda 사용 방법 **/
        System.out.println("----Lambda----");
        fruits.forEach((key, value) ->{
            System.out.println(key + " : " + value);
        });
    }
}

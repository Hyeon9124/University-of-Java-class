package chap11;
import java.util.HashMap;
import java.util.Map;

/** [1] map.entrySet() **/

public class HashMapTest01 {
    public static void main(String[] args) {

        Map<String, Integer> map = Map.of("사과", 5, "바나나", 3, "포도", 2, "딸기", 1);
        // of 메소드를 이용해서 최대 10개까지 만들 수 있음.

        Map<String, Integer> fruits = new HashMap<>(map); // map 데이터를 fruits에 가져옴
        fruits.put("귤", 2); // fruits에 (key, value) = ("귤", 2) 데이터를 입력

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
        fruits.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
/**
 * HashMap 대신 Map 사용하는 이유 : 여러가지 종류들의 Map들은 모두 Map Interface를 구현하는 구조로 정의되어 있다.
 * 그렇기 때문에 그냥 Map Interface를 사용해서 HashMap을 사용하게 되면 나중에 HashMap이 아닌 다른 종류의 Map을 사용해야
 * 하는 상황이 발생하면 많은 코드 수정 필요없이 손쉽게 이를 반영할 수 있다.

 * 하지만 HashMap으로 선언하면 오직 HashMap에 대한 Object만 담을 수 있기 때문에 코드 수정이 더 많아지고 불편해진다.
 * 즉, 유지 보수성이 떨어진다고 할 수 있다.
 **/
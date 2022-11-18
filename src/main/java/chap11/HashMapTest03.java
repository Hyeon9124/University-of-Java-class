package chap11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/** [3] map.values() method Practice **/

public class HashMapTest03 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        // key : Integer, value : String

        map.put(1, "사과");
        map.put(2, "바나나");
        map.put(3, "포도");
        map.put(4, "딸기");

        // Collection<V> values() : 모든 값을 Collection type으로 반환한다.
        Collection<String> values = map.values(); // map에 있는 value 들을 Collection으로 가져옴
        System.out.println(values); // Collection type으로 결과가 나옴

        // 출력 결과 : [사과, 바나나, 포도, 딸기]
    }
}

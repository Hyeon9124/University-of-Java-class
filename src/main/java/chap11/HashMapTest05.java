package chap11;

import java.util.HashMap;
import java.util.Map;

/** [5] forEach() method => JDK 8 이후 지원 **/

public class HashMapTest05 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "사과");
        map.put(2, "바나나");
        map.put(3, "포도");
        map.put(4, "딸기");

        /** Lambda : () -> {}) : 기억할 것!! **/

        // (1)
        // map.forEach((key, value) -> {System.out.println(key + " : " + value);});
        // BiConsumer.. Consumer는 return 값이 없음.

        map.forEach((key, value) -> System.out.println(key + " : " + value)); // 한 줄로 출력할 경우 {}를 빼도 됨.
        // BiConsumer이므로 Key와 Value 매개변수가 들어가야 한다.

        map.forEach((key, value) -> {
            System.out.println(key + " " + value);
        }); // 위의 코드가 훤씬 보기 좋고 간단함..  한 줄로 쓰는 연습을 많이 하고 익숙해져야 함.

    }
}
/*
 * Consumer Functional Interface 류 :
 * - 매개값만 있고 return 값이 없는 추상 메소드를 가지고 있다.
 */

/**
 * efault void forEach(BiConsumer<? super K, ? super V> action) {
 *         Objects.requireNonNull(action);
 *         for (Map.Entry<K, V> entry : entrySet()) {
 *             K k;
 *             V v;
 *             try {
 *                 k = entry.getKey();
 *                 v = entry.getValue();
 *             } catch (IllegalStateException ise) {
 *                 // this usually means the entry is no longer in the map.
 *                 throw new ConcurrentModificationException(ise);
 *             }
 *             action.accept(k, v);
 *         }
 *     }
 **/

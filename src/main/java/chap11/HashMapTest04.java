package chap11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/** [4] Iterator **/

public class HashMapTest04 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "사과");
        map.put(2, "바나나");
        map.put(3, "포도");
        map.put(4, "딸기");

        Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
        // Iterator<K> keyIterator = keySet.iterator() 형식

        /*
         *  entrySet()로 모든 Map.Entry를 Set Collection으로 얻은 다음
         *  반복자를 통해 Map.Entry를 하나씩 얻고 getKey()와 getValue()를 통해 key와 value를 얻는다.
         */

        while(itr.hasNext()){ // 다음 위치에 원소가 있는지 조사
            Map.Entry<Integer, String> entrySet = itr.next();
            // Map.Entry 다음 위치의 원소를 가져오고 반복자의 위치를 다음 위치로 이동한다.

            System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
            // key 와 value 값을 출력한다.

            /*
            -- 출력 결과 --
            1 : 사과
            2 : 바나나
            3 : 포도
            4 : 딸기
             */
        }

    }
}

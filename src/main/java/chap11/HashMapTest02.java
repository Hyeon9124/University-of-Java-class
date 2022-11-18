package chap11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/** [2] map.keySet() method Practice **/

public class HashMapTest02 {
    public static void main(String[] args) {
        // Alt + enter : import 자동 생성

        Map<Integer, String> map = new HashMap<>();
        // 앞의 Generic type이 똑같으면 new HashMap<String, Integer>() 안해도 문제없음.

        /** key는 중복 X **/
        map.put(1, "사과");
        map.put(2, "바나나");
        map.put(3, "포도");
        map.put(4, "딸기");


        Set<Integer> keySet = map.keySet(); // key의 요소들을 순회

        for(Integer key : keySet){ // foreach로 출력 --> 개선된 for문
            System.out.println(key + " : " + map.get(key)); // key : value 형태로 출력
        }
        /** map.get(key) : key에 해당하는 value 값을 가져온다.. **/

    }
}

package chap11;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class SortTest01 {
    public static void main(String[] args) {
        String[] fruits = {"포도", "수박", "사과", "키위", "망고"}; // String type의 arr

        // (1)
        List<String> list = Arrays.asList(fruits); // List type으로 변환하는 코드
        System.out.println(list); // 출력 결과 : [포도, 수박, 사과, 키위, 망고]

        // (2)
        Collections.reverse(list); // reverse() : List 원소들을 역순으로 정렬한다.
        System.out.println(list); // 출력 결과 : [망고, 키위, 사과, 수박, 포도]

        // (3)
        Collections.sort(list, Collections.reverseOrder()); // 오름차순으로 정렬 후 내림차순으로 정렬
        // 가나다라마바사아자차카타파하
        // Collections.reverseOrder() : List의 역방향이므로 오름차순에서 내림차순으로 변경된다.
        System.out.println(list); // 출력 결과 : [포도, 키위, 수박, 사과, 망고]
    }
}
// sort : List를 오름차순으로 정렬
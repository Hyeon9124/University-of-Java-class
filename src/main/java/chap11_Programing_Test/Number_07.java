package chap11_Programing_Test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class Number_07 {
    public static void main(String[] args) {
        // 2개의 String type의 배열 생성 및 초기화
        String[] s1 = {"a", "b", "a", "b", "c"};
        String[] s2 = {"c"};

        // 두 배열을 Collections의 addAll() 메서드를 이용해 HashSet 객체로 생성
        Set<String> set1 = new HashSet<>(); // HashSet 생성(set1)
        set1.addAll(Arrays.asList(s1)); // s1 배열의 요소들을 set1에 저장

        Set<String> set2 = new HashSet<>(); // HashSet 생성(set2)
        set2.addAll(Arrays.asList(s2)); // s2 배열의 요소들을 set2에 저장

        // 2개의 HashSet 객체를 출력
        System.out.println("set1 : " + set1);
        System.out.println("set2 : " + set2);

        // 2개의 HashSet 객체가 동일한지 비교한 값을 출력
        // 2개의 객체가 동일한지 확인하려면 equals() and hashCode() 값이 같아야 하므로 다음과 같은 코드를 이용한다.
        if(set1.equals(set2) && set1.hashCode() == set2.hashCode()){ // equals() and hashCode() 모두 같으면
            System.out.println("set1과 set2는 같다 : true"); // true 출력
        }
        else{ // 아니면
            System.out.println("set1과 set2는 같다 : false"); // false 출력
        }

        // s1에 의한 HashSet이 s2에 의한 HashSet 원소를 모두 포함하는지 출력
        System.out.println("set1은 set2의 모든 원소를 포함한다 : " + set1.containsAll(set2));
        // boolean containsAll(Collection<?> c) : 주어진 Collection에 저장된 모든 Object를 포함하고 있는지 true, false로 반환

        // 2개의 HashSet 합집합과 교집합을 구해서 출력
        Set<String> union = new HashSet<>(); // 합집합을 갖는 HashSet 생성(union)
        // addAll() : 지정된 Collection의 모든 요소들을 집합에 추가
        union.addAll(set1);
        union.addAll(set2);
        // set1과 set2의 모든 요소들을 union에 추가한다.(중복 값은 제거 되므로 중복이 발생하지 않는다.)
        System.out.println("합집합 : " + union); // 합집합 출력

        Set<String> intersection = new HashSet<>(); // 교집합을 갖는 HashSet 생성(intersection)
        // retainAll() : 요소들을 Collection 인자의 요소들과 비교하여 동일한 요소는 HashSet에 남기고 그 외 요소들을 제거한다.
        intersection.addAll(set1); // set1의 모든 요소들을 intersection에 추가
        intersection.retainAll(set2); // set2 요소를 intersection 요소들과 비교하여 교집합을 찾는다.
        System.out.println("교집합 : " + intersection); // 교집합 출력
    }
}
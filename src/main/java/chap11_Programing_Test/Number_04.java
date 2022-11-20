package chap11_Programing_Test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class Number_04 {
    public static void main(String[] args) {
        Set<String> a1 = new HashSet<>(); // HashSet 생성, 동물 이름을 저장하기 위해 Generic => String
        a1.addAll(Arrays.asList("독수리", "나비", "염소", "고양이", "개미", "여우"));
        /* boolean addAll(Collection<? extends E> c) :
         * 인자로 List 또는 Set과 같은 Collection Object를 받으며 이 Object의 모든 요소들을 Set에 추가한다.
         */

        System.out.println("hashset" + a1); // HashSet 원소 출력

        TreeSet<String> treeSet = new TreeSet<>(a1); // HashSet Object를 TreeSet 타입으로 변환
        System.out.println("treeset" + treeSet); // TreeSet 원소 출력

        System.out.println("첫 번째 동물 : " + treeSet.first());
        // first() : TreeSet에 정렬된 순서에서 첫 번째(가장 낮은) 요소를 반환
        System.out.println("마지막 동물 : " + treeSet.last());
        // last() : TreeSet에 정렬된 순서에서 마지막(가장 높은) 요소를 반환
        System.out.println("나비 앞에 있는 동물 : " + treeSet.lower("나비"));
        // lower(e) : 매개변수로 입력된 요소 보다 작은 요소 중 가장 큰 요소를 반환, 없으면 null 반환
    }
}
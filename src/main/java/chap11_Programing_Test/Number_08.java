package chap11_Programing_Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Number_08 {
    public static void main(String[] args) {
        String[] s = {"독수리", "고양이", "강아지"}; // arr 배열 생성 및 초기화

        List<String> list = Collections.nCopies(2, "개미"); // List 배열 생성
        // 동물 이름을 저장해야 하므로 Generic => String
        // nCopies(int n, T o) : n개 만큼 지정된 Object로 초기화하는 함수
        System.out.println(list);

        List<String> al1 = new ArrayList<>(list); // List(al1) 배열 생성 및 list Collection 값으로 초기화
        System.out.println("nCopies : " + al1);

        Collections.fill(al1, "벌"); // fill(List<? super T> list, T obj) : 리스트의 모든 원소를 특정 값으로 덮어쓴다.
        System.out.println("'벌'을 채운 후 : " + al1);

        al1.addAll(Arrays.asList(s)); // addAll(Collection<? extends E> c)
        // arr 배열을 List 배열로 반환 후 addAll()를 사용해 원소들을 List 배열에 추가
        System.out.println("리스트를 모두 추가한 후 : " + al1);

        // Collections.shuffle()을 이용하면 프로그래밍 문제 예시 답과 다르게 나올 수 있음
        Collections.shuffle(al1); // shuffle(List<?> list) : List 배열을 섞는 함수
        System.out.println("리스트를 섞은 후 : " + al1);

        Collections.reverse(al1); // reverse(List<?> list) : List 배열을 역순으로 정렬하는 함수
        System.out.println("리스트를 역순으로 정렬한 후 : " + al1);

        System.out.println("리스트에서 최소 : " + Collections.min(al1));
        // min(Collection<? extends T> coll) : Collections class에서 지원하는 min()를 이용하여 리스트의 최소값을 구한다.
        System.out.println("리스트에서 최대 : " + Collections.max(al1));
        // max(Collection<? extends T> coll) : Collections class에서 지원하는 max()를 이용하여 리스트의 최대값을 구한다.
        System.out.println("리스트에서 '벌'의 빈도 : " +
                Collections.frequency(al1, "벌"));
        // frequency(Collection<?> c, Object o) : Collection에 주어진 원소의 빈도수를 반환한다.
    }
}
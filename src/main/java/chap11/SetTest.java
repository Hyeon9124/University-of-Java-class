package chap11;
import java.util.HashSet;
import java.util.Set;
public class SetTest {
    public static void main(String[] args) {
        String[] fruits = {"사과", "바나나", "포도", "수박"};

        // 2개의 object 생성 및 초기화
        Set<String> hs1 = new HashSet<>();
        Set<String> hs2 = new HashSet<>();

        for(String s : fruits){ // arr, Collection 둘 다 foreach 사용 가능
            hs1.add(s); // HashSet에 원소를 추가
        }
        System.out.print("1단계 : " + hs1 + " "); // arr로 출력됨 : []
        // 출력 결과 -> 1단계 : [포도, 수박, 사과, 바나나]
    }
}
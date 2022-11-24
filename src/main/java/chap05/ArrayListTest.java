package chap05;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ArrayListTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 데이터를 입력하기 위해 Scanner 사용
        // ArrayList<Integer> scores = new ArrayList<>();
        List<Integer> scores = new ArrayList<>();

        int data;
        int sum = 0;

        while((data = scanner.nextInt()) >= 0){ // data가 0보다 크거나 같을때 까지 입력을 받는다.
            scores.add(data); // ArrayList에 데이터 추가
        }
        for(int i = 0; i < scores.size(); i++){ // ArrayList의 크기만큼 반복문 실행
            sum += scores.get(i); // ArrayList의 데이터를 가져오고 sum에 데이터를 더한다.
        }
        System.out.println("평균 : " + (double) sum / scores.size());
    }
}
// 배열의 길이 : length
// 문자열의 길이 : length()
// Collection Framework(ArrayList, Set, Map 등) : size()
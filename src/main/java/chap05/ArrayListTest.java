package chap05;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ArrayListTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 데이터를 입력하기 위해 Scanner 사용
        // ArrayList<Integer> scores = new ArrayList<>();
        // ArrayList 객체에 원소를 추가하면 0번 index 부터 차례대로 저장된다.
        // ArrayList<참조타입> 참조변수 = new ArrayList<>(); -> 배열 크기가 고정된 정적 배열이다.
        List<Integer> scores = new ArrayList<>();
        // List<참조타입> 참조변수 = new ArrayList<>();

        int data;
        int sum = 0; // sum을 0으로 초기화

        while((data = scanner.nextInt()) >= 0){ // data가 0보다 크거나 같을때 까지 입력을 받는다.
            scores.add(data); // add() 통해 데이터 추가
        }
        for(int i = 0; i < scores.size(); i++){ // ArrayList의 크기만큼 반복문 실행
            sum += scores.get(i); // List의 데이터를 가져오고 sum에 데이터를 더한다.
        }
        System.out.println("평균 : " + (double) sum / scores.size()); // 명시적 형 변환를 통해 출력(double)
    }
}
/*
  참조변수.add(데이터) : 데이터를 동적 배열에 원소로 추가
  참조변수.remove(index number) : 동적 배열에서 index 번호의 원소를 제거
  참조변수.get(index number) : 동적 배열에서 index 번호의 원소를 가져온다.
  참조변수.size() : 동적 배열에 포함된 원소 개수
 */
                    /** 외울 것! **/
/*
  배열의 길이 : length
  문자열의 길이 : length()
  Collection Framework(ArrayList, Set, Map 등) : size()
 */

package chap11;

import java.util.Arrays;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        String[] animals1 = new String[]{"사슴", "호랑이", "바다표범", "곰"};

        // [1]
        List<String> animals2 = Arrays.asList(animals1); // arr 배열을 List 타입으로 변형
        
        animals2.set(1, "고양이"); // 원하는 index를 String으로 바꾸는 코드
        // animals2.add("다람쥐");   Collection은 추가 가능한데 list는 추가가 안된다? --> list는 index가 되어야함.

        for(String s : animals2){
            System.out.print(s + " ");
        }
        System.out.println();


        // [2] : length를 기준으로 Accending

        /**
              -- Arrow Function --
        Lambda Expression Java(Python) : () -> {}
        JavaScript : () => {}

        **/

        // Comparable<>
        animals2.sort((x, y) -> x.length() - y.length()); // 문자열 길이를 비교해서 정렬
        String[] animals3 = animals2.toArray(new String[0]); // list -> arr


        for(int i = 0; i < animals3.length; i++){
            sb.append(animals3[i] + " ");
        }
        System.out.println(sb);


        // of() factory method 
        // [3] : immutable Data(불변 데이터) => set() method 사용불가
        // forEach() 사용

        List<String> cars = List.of("소나타", "그랜저", "아반떼", "제네시스");
        // cars.set(1, "K5"); --> immutable error

        cars.forEach(s -> System.out.print(s + " "));
    }
}

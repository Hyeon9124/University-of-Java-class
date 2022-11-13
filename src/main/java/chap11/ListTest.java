package chap11;

import java.util.Arrays;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        String[] animals1 = new String[]{"사슴", "호랑이", "바다표범", "곰"}; // arr는 크기가 정해져 있음.

        // [1]
        List<String> animals2 = Arrays.asList(animals1); // arr 배열을 List 타입으로 반환
        
        animals2.set(1, "고양이"); // 1번 index에 "고양이"를 추가
        // animals2.add("다람쥐");   배열을 List Type으로 변경했으므로 크기를 변경할 수 없어 실행 오류가 발생한다.
        // set을 이용해 원하는 index에 값을 변경하는 것은 가능하다.

        for(String s : animals2){
            System.out.print(s + " ");
        }
        System.out.println();


        // [2] : length를 기준으로 Ascending

        /**
              -- Arrow Function --
        Lambda Expression Java(Python) : () -> {}
        JavaScript : () => {}

        **/

        // Comparable<>
        animals2.sort((x, y) -> x.length() - y.length()); // ascending의 Algorithm, 값을 비교... Comparable에서 사용..
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

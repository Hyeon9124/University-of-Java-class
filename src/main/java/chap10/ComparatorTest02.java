package chap10;
import java.util.Arrays;
public class ComparatorTest02 {
    public static void main(String[] args) {
        String[] strings = {"로마에 가면 로마법을 따르라.", "시간은 금이다.", "펜은 칼보다 강하다."};

        // Ascending
//        Arrays.sort(strings, (first, second) -> first.length() - second.length()); // Lambda 사용 가능

        // Descending
        Arrays.sort(strings, (first, second) -> second.length() - first.length()); // Lambda 사용 가능

        for(String s : strings){ // String type의 foreach문
            System.out.println(s);
        }
    }
}
// ComparatorTest01의 코드보다 ComparatorTest02의 코드를 이용하는 것이 더 좋다.
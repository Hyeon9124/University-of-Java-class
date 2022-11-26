package chap10;
import java.util.Arrays;
import java.util.Comparator;
public class ComparatorTest01 {
    public static void main(String[] args) {
        String[] strings = {"로마에 가면 로마법을 따르라.", "시간은 금이다.", "펜은 칼보다 강하다."};

        Arrays.sort(strings, new Comparator<String>() { // sort(T[] a, Comparator<? super T> c)
            @Override
            public int compare(String first, String second) { // 익명 구조로 되어 있음. parameter 2개
                /** Ascending **/
                //return first.length() - second.length(); // 비즈니스 로직
                // 람다식으로 두 문자열 길이를 뺼셈해 비교한다.

                /** Descending **/
                return second.length() - first.length(); // 비즈니스 로직
                // 람다식으로 두 문자열 길이를 뺼셈해 비교한다.
            }
        });
        for (String s : strings) { // String type의 foreach문
            System.out.println(s);
        }
    }
}
/** Functional Interface 구조로 만들어지면 Lambda Expression으로 표현할 수 있다. **/
// 비즈니스 로직 : 업무에 필요한 데이터 처리를 수행하는 응용프로그램의 일부를 말한다.
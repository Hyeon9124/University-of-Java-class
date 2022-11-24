package chap08;
import java.util.StringTokenizer;
public class StringTokenizerTest {
    public static void main(String[] args) {
        String str = "of the people, by the people, for the people"; // 문자열 리터럴 생성

        StringTokenizer st = new StringTokenizer(str ," ,"); // 구분자를 사용하여 문자열을 분리한다.

        System.out.println(st.countTokens()); // st.countTokens() : 남아 있는 토큰의 개수를 반환한다.

        while (st.hasMoreTokens()){ // hasMoreTokens() : 남아 있는 토크이 있는지 여부를 반환한다. (true, false 반환)
            System.out.print("[" + st.nextToken() + "] "); // nextToken() : 다음 토큰을 꺼내온다.
        }
    }
}
/*
 StringTokenizer(String s) : 주어진 문자열을 기본 구분자로 파싱한 StringTokenizer 객체를 생성한다.
 StringTokenizer(String s, String delim) 주어진 문자열을 delim 구분자로 파싱한 StringTokenizer 객체를 생성한다.
 */
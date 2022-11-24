package chap05;
// import java.lang.*;
// lang 패키지는 생략 가능함
public class StringComparisonTest01 {
    public static void main(String[] args) {
        // 자바는 문자열 리터럴을 내부적으로 String Object로 처리한다.
        // String Object를 생성하면 Stirng Class의 Constructor를 호출한다.

        // String type의 변수 선언과 초기화
        String s1 = "Hello ICT"; 
        String s2 = "Hello ICT";
        // 새로운 문자열 Object를 생성해 String type의 s3 변수를 초기화한다.
        String s3 = new String("Hello ICT");

        // s1 == s2 : s1과 s2 문자열 Objcet가 동일한 Object를 가리키는지 조사한다.
        System.out.println("s1 == s2 : " + (s1 == s2)); // true false로 출력
        // s1 == s3 : s1과 s3 문자열 Objcet가 동일한 Object를 가리키는지 조사한다.
        System.out.println("s1 == s3 : " + (s1 == s3)); // true false로 출력

        // Assignment Operator
        s1 = s3;
        System.out.println("s1 == s3 : " + (s1 == s3)); // true false로 출력
    }
}
package chap05;
// import java.lang.*;
// lang 패키지는 생략 가능함
public class StringComparisonTest01 {
    public static void main(String[] args) {
        /*
          자바는 문자열 리터럴을 내부적으로 String Object로 처리한다.
          문자열 리터럴은 내부적으로 new String()을 호출해 생성한 객체이다.
          String Object를 생성하면 Stirng Class의 Constructor를 호출한다.
        */
        // String type의 변수 선언과 초기화
        String s1 = "Hello ICT"; 
        String s2 = "Hello ICT";
        // 새로운 문자열 Object를 생성해 String type의 s3 변수를 초기화한다.
        String s3 = new String("Hello ICT");

        /*
          프로그램에서 두 문자열을 비교할 때는 == or != 연산자를 사용하면 안된다.
          위의 두 연산자는 문자열의 내용을 비교하는 것이 아니라 동일한 객체인지를 검사한다.
         */
        System.out.println("s1 == s2 : " + (s1 == s2)); // true false로 출력
        System.out.println("s1 == s3 : " + (s1 == s3)); // true false로 출력

        // Assignment Operator
        s1 = s3;
        System.out.println("s1 == s3 : " + (s1 == s3)); // true false로 출력
    }
}
/*
  String 클래스에서 제공하는 문자열 비교 메서드

  int compareTo(String s) : 문자열을 사전 순으로 비교해 정수값을 반환한다.
  boolean equals(String s) : 주어진 문자열 s와 현재 문자열을 비교한 후 true/false를 반환한다.
 */
// String valueOf() : 각종 primitive data type이나 Object를 문자열로 반환
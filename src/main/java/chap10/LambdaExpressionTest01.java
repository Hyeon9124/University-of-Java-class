package chap10;
/*
 [1] parameter와 return 값이 없는 첫번째 Lambda Expression
 */
@FunctionalInterface // Annotation
/*
 1. 하나의 abstract method만을 가지는지 컴파일러가 체크하도록 한다.
 2. 2개 이상의 abstract method가 선언되어 있으면 컴파일 오류 발생
 */
// 어노테이션이 없어도 함수형 인터페이스로 동작하고 사용하는 데 문제는 없지만, 인터페이스 검증과 유지보수를 위해 붙여주는 것이 좋다.
interface IctFunctionalInterface{ // interface 생성
    // 익명함수 생략 가능
    public void method(); // abstract 생략 가능
}
public class LambdaExpressionTest01 {
    public static void main(String[] args) {
        IctFunctionalInterface fi; // IctFunctionalInterface 변수 선언

        // (1) : 일반적인 Lambda Expression
        fi = () -> {
            String str = "Lambda Expression Practice 01"; // 문자열 리터럴 생성
            System.out.println(str); // 출력
        };
        fi.method(); // 일반적인 Lambda Expression 표현 방법

        // (2) : 줄임없이 한줄로 표현하는 방법
        fi = () -> {System.out.println("Lambda Expression Practice 02");};
        fi.method();
        
        // (3) : 줄임이 있는 Lambda Expression 표현
        // () : parameter와 return 값이 없으면 생략불가
        fi = () -> System.out.println("Lambda Expression Practice 03");
        fi.method();
    }
}
/** (선언부) -> {구현부} **/
/*
  1. 선언부의 타입은 추론할 수 있으므로 타입을 생략해도 된다.
  2. 매개변수가 하나 있다면 괄호를 생략할 수 있다.
  3. 실행문이 하나 있다면 중관호와 세미콜론을 생략할 수 있다. 단, 실행문이 하나의 return문이면 return 키워드도 생략해야 한다.
*/
// 자바는 Lambda Expression을 Functional Interface의 익명 객체로 구현
// Functional Interface : 하나의 abstract method만 선언된 Interface를 말한다.
// Annotation -> 2개 이상이면 error 발생

/*
  모든 interface는 Lambda Expression의 Target Type이 될 수 없다.
   - Lambda Expression은 하나의 method를 정의하기 때문
   - 하나의 abstract method만 선언된 Interface만 Target Type이 될 수 있다.
 */
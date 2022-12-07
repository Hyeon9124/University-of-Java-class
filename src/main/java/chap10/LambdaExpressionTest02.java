package chap10;
/*
 [2] parameter one,  void type(return) 값이 없다.
 */
@FunctionalInterface
interface Printable{ // interface 생성
    void print(String s); // parameter : String type
}
public class LambdaExpressionTest02 {
    public static void main(String[] args) {
        Printable p; // Printable 변수 선언

        // (1) : 일반적인 Lambda Expression
        p = (String s) -> {System.out.println(s);};
        p.print("Parameter one, return no 01"); // 원하는 값을 넣어준다.

        // (2) : 줄임이 있는 LambdaExpression
        p = (String s) -> System.out.println(s);
        p.print("Parameter one, return no 02"); // 원하는 값을 넣어준다.

        // (3) : parameter type 생략 가능
        p = (s) -> System.out.println(s); // parameter 1개, return 값이 없을 때 가능함.
        // type이 1개만 있을때도 생략가능 하다.
        p.print("Parameter one, return no 03"); // 원하는 값을 넣어준다.

        // (4) : () 생략 가능
        p = s -> System.out.println(s); //
        p.print("Parameter one, return no 04"); // 원하는 값을 넣어준다.

        // (5) : method reference
        p = System.out::println; // method Reference, :: 은 method 참조 연산자이다.
        p.print("Parameter one, return no 05 study");
    }
}
// (4)또는 (5)와 같은 코드를 사용하는 것이 좋다.

/*
  static method Reference : 클래스 이름::정적 메서드
  instance method Reference : 객체 이름::인스턴스 메서드(혹은 클래스 이름::인스턴스 메서드)
  Constructor Reference : 클래스 이름::new 혹은 배열타입이름::new
 */
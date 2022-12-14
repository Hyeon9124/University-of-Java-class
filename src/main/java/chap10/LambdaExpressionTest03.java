package chap10;
/*
 [3] parameter two, void type(no return)
 */
@FunctionalInterface
interface Calculate{
    void cal(int a, int b);
}
public class LambdaExpressionTest03 {
    public static void main(String[] args) {
        Calculate c; // Calculate 변수 선언

        /** parameter가 2개 일 때는 () 생략 불가능! **/

        // (1) 덧셈
        c = (x, y) -> System.out.println(x + y); // result : 43
        c.cal(33, 10);

        // (2) 뺼셈
        c = (x, y) -> System.out.println(x - y); // result : 23
        c.cal(33, 10);

        // (3) 곱셈
        c = (x, y) -> System.out.println(x * y); // result : 330
        c.cal(33, 10);

        // (4) 나눗셈
        c = (x, y) -> System.out.println((double) x / y); // result : 3.3
        // (double) x / (double) y or (double) x / y or x / (double) y 로 하면 3.3이 나옴
        c.cal(33, 10);

        // 람다식에서 덧셈, 뺄셈, 곱셈, 나눗셈 계산이 가능하다.
    }
}
/** (타입 매개변수) -> {실행문; 실행문;}
    [선언부] [람다식 연산자]  [구현부]    **/
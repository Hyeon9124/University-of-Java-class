package chap10;
/** 중요 **/
/*
 [6] Generics Interface
   - Generics parameter, Generics return type -
 */
@FunctionalInterface
interface Calculate3<T>{ // Generic type으로 interface 생성
    T cal(T a, T b);
    // argument(인수)에 맞는 type이 들어가서 메모리에 로드된다.
}
public class LambdaExpressionTest06 {
    public static void main(String[] args) {
        // (1) Integer type
        Calculate3<Integer> c3 = (x, y) -> x + y; // return 문장이 1개이므로 생략가능
        System.out.println(c3.cal(3, 3)); // result : 6

        // (2) Double type
        Calculate3<Double> c4 = (x, y) -> x + y; // return 문장이 1개이므로 생략가능
        System.out.println(c4.cal(3.33, 3.45)); // result : 6.78
    }
}
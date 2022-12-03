package chap10;
/*
 [5] parameter two, return type 존재
 */
@FunctionalInterface
interface Calculate2{
    int cal(int a, int b);
}
public class LambdaExpressionTest05 {
    public static void main(String[] args) {
        Calculate2 c2; // Calculate2 변수 선언

        // (1)
        c2 = (x, y) -> {return x + y;};
        System.out.println(c2.cal(6, 3)); // result : 9

        /** 중요! **/
        // return 값이 존재하는 경우에만 생략 가능하다.
        // (2) : {} 와 return keyword 생략 가능(return 문장이 1개만 있을 때)
        c2 = (x, y) ->  x + y;
        System.out.println(c2.cal(6, 3)); // result : 9
    }
}
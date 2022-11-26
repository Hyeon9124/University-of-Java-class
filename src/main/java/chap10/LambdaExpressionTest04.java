package chap10;
/*
 [4] parameter one, return type 존재
 */
@FunctionalInterface
interface LengthCount{
    int len(String s); // 문자열 길이를 반환하기 위해 int type의 methode 생성
}
public class LambdaExpressionTest04 {
    public static void main(String[] args) {
        LengthCount lc; // LengthCount 변수 선언

        // (1)
        lc = s -> s.length(); // result : 18
        System.out.println(lc.len("Semyung University")); // spacebar도 count된다.
    }
}
package study;

@FunctionalInterface
interface operator{
    void sum(int a, int b);
}
public class LambdaTest01 {
    public static void main(String[] args) {
        operator op;

        int a = 10;
        int b = 5;

        op = (x, y) -> System.out.println(x + y);
        op.sum(a, b);
    }
}
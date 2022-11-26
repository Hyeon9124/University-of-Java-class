package chap10.functionalinterfaceapi;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
/*
 [1] Predicate Functional Interface => test() method
 */
public class PredicateTest01 {
    static int sum(Predicate<Integer> p, List<Integer> lst){ // Generics type 사용
        int s = 0;

        for(int n : lst){ // foreach 사용
            if(p.test(n)){ // Predicate의 메서드인 test() 사용
                // boolean test(T t); : 매개 값을 조사하여 논리값으로 보낸다.
                s += n; // s에 n을 더해줌
            }
        }
        return s; // return 값 반환
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15); // List Collection type으로 변환

        int s;

        s = sum(n -> n % 2 == 0, list); // n이 짝수이면 list 값을 sum(Predicate<Integer> p, List<Integer> lst)에 넣는다
        System.out.println("짝수의 합 : " + s); // result : 18

        s = sum(n -> n % 2 != 0, list);
        System.out.println("홀수의 합 : " + s); // result : 27
    }
}
// Predicate<T> p = t -> {T 타입 t 객체를 조사하여 논리값으로 반환하는 실행문;};
// Predicate Functional Interface : 매개값을 조사해서 true 또는 false를 리턴할 때 사용한다.
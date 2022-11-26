package chap10.functionalinterfaceapi;
import java.util.function.Function;
/*
 [4] Function Functional Interface => apply() method
 */
public class FunctionTest01 {
    public static void main(String[] args) {
        // interface Function<T, R>
        Function<String, Integer> f = s -> s.length(); // length로 return 함
        // 원하는 값이 String에 들어오면 String의 length를 return 해준다.

        System.out.println(f.apply("Semyung University")); // R apply(T t);
        System.out.println(f.apply("ICT"));
    }
}
// Function<T, R> f = t -> {T 타입 t 객체를 사용하여 R 타입 객체를 반환하는 실행문;};
// Function Functional Interface : 매개값과 리턴값이 모두 있는 추상 method를 가지고 있다.
//                                 주로 매개값을 리턴값으로 매핑(타입 변환)할 경우에 사용한다.
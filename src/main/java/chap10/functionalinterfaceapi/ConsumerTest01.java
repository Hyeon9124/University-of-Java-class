package chap10.functionalinterfaceapi;
import java.util.function.Consumer;
/*
 [2] Consumer Function Interface => accept() method
 */
public class ConsumerTest01 {
    public static void main(String[] args) {
        Consumer<String> c = s -> System.out.println(s);

        // void accept(T t); : 매개 값을 소비한다.
        c.accept("School of ICT");
        c.accept("Semyung University");
    }
}
// Consumer<T> c = t -> {T 타입 t 객체를 사용한 후 void를 반환하는 실행문;};
// Consumer Function Interface : 매개값만 있고 리턴값이 없는 추상 method르 가지고 있다.
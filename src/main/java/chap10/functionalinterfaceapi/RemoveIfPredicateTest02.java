package chap10.functionalinterfaceapi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class RemoveIfPredicateTest02 {
    public static void main(String[] args) {
        // Integer type으로 데이터가 들어올 때
        List<Integer> lsi = Arrays.asList(1, -2, 3, -4, 5);
        lsi = new ArrayList<>(lsi); // Collection type

        // Double
        List<Double> lsd = Arrays.asList(-1.1, 2.2, 3.3, -4.4, 5.5);
        lsd = new ArrayList<>(lsd);

        Predicate<Number> p = n -> n.doubleValue() < 0.0;
        // 데이터 필터링
        lsi.removeIf(p); // 조건에 해당하는 값을 삭제함
        lsd.removeIf(p);

        System.out.println(lsi); // result : [1, 3, 5]
        System.out.println(lsd); // result : [2.2, 3.3, 5.5]
    }
}
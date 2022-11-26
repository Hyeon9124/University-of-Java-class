package chap10.functionalinterfaceapi;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
/*
 [3] Supplier Function Interface => get() method
 */
public class SupplierTest01 {
    public static List<Integer> makeIntList(Supplier<Integer> s, int n){ // public 생략 가능
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= n; i++){ // 1부터 50까지
            list.add(s.get()); //  T get(); : 반환값을 공급한다.
        }
        return list;
    }
    public static void main(String[] args) {
        Supplier<Integer> spr = () -> {
            Random random = new Random(); // Random 객체 생성

            return random.nextInt(50); // spr에 50개 숫자를 넣는다.
        };

        List<Integer> lis = makeIntList(spr, 6); // 50개 중에서 6개를 출력하기 위한 코드
        System.out.println(lis); // 숫자 6개가 랜던으로 출력된다.
    }
}
// Supplier<T> s = () -> {T 타입 t 객체를 반환하는 실행문;};
// Supplier Function Interface : 매개값은 없고 리턴값만 있는 추상 method를 가지고 있다.
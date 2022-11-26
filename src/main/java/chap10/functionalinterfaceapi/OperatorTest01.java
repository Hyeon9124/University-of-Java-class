package chap10.functionalinterfaceapi;
import java.util.function.DoubleUnaryOperator;
/*
 [5] Operator Functional Interface => apply() method (API Document 참조)
  - DoubleUnaryOperator -
 */
public class OperatorTest01 {
    public static void main(String[] args) {
        DoubleUnaryOperator cti = d -> d * 0.393701; // cm -> inch
        DoubleUnaryOperator itc = d -> d * 2.54; // inch -> cm

        // double applyAsDouble(double operand);
        System.out.println("34 inch : " + itc.applyAsDouble(34.0) + " cm 입니다.");
        System.out.println("86 cm : " + cti.applyAsDouble(86.0) + " inch 입니다.");
    }
}
// 자주 사용하지 않음
// BinaryOperator<T> o = (x, y) -> {T 타입 x와 y 객체를 사용하여 T 타입을 반환하는 실행문;};
// Operator Functional Interface : 매개값과 리턴값이 모두 있는 추상 method를 가지고 있다.
//                                 주로 매개값을 연산하고 그 결과를 리턴할 경우에 사용한다.
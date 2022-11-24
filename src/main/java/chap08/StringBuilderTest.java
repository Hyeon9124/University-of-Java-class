package chap08;
public class StringBuilderTest {
    public static void main(String[] args) {
        // [1] String + operator 사용
        String str = new String("정보통신학부"); // Object 생성

        System.out.println("[1] String + operator 사용");
//        System.out.println(str);
        System.out.println(str.hashCode()); // 정보통신학부가 가리키는 hashCode

        str += "화이팅!!"; // 화이팅!! 문자열을 더한다.

        System.out.println(str.hashCode()); // 정보통신학부가 + 화이팅!! 결과값을 가리키는 hashCode

        // [2] StringBuilder append() 사용
        System.out.println("\n[2] StringBuilder append() 사용");
        StringBuilder sb = new StringBuilder("정보통신학부");

        System.out.println(sb.hashCode());

        sb = sb.append("화이팅!!");
        System.out.println(sb.hashCode());
    }
    /*
     Object 클래스의 hashCode() 메서드는 객체의 메모리 주소를 사용하여 계산한 해시값을 반환한다.
     해시값은 객체를 식별하는 정수값으로 두 객체의 해시값이 다르면 서로 다른 객체임을 의미한다.

     21행에 있는 append() 메서드에서 = 연산의 좌우에 있는 StringBuilder의 해시값은 서로 같다.
     */
}
/*
Auto Boxing : Wrapper class obj = primitive Data type :: int -> Integer
Auto Unboxing : Wrapper 클래스 타입을 원시 타입으로 변환하는 과정의 의미, ex) Integer -> int
 */
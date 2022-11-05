package chap08;

public class StringBuilderTest {

    public static void main(String[] args) {
        String str = new String("정보통신학부");

        System.out.println("[1] String + operator 사용");
//        System.out.println(str);
        System.out.println(str.hashCode());

        str += "화이팅!!";

        System.out.println(str.hashCode());

        System.out.println("\n[2] StringBuilder append() 사용");

        StringBuilder sb = new StringBuilder("정보통신학부");

        System.out.println(sb.hashCode());

        sb.append("화이팅!!");
        System.out.println(sb.hashCode());

    }
}
/*
Auto Boxing : Wrapper class obj = primitive Data type :: int -> Integer
Auto Unboxing :
 */
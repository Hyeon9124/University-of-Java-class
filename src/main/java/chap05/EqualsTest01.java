package chap05;
public class EqualsTest01 {
    public static void main(String[] args) {
        // deprecated : 사용을 권장하지 않는다.
        // 아래와 같은 코드는 사용하지 않는 것이 좋다.
        Integer a = new Integer(33); // deprecated
        Integer b = new Integer(30); // deprecated

        System.out.println(a.equals(b)); // a 오브젝트와 b 오브젝트를 비교
    }
}
/*
   public boolean equals(Object obj) {
        if (obj instanceof Integer) {
            return value == ((Integer)obj).intValue();
        }
        return false;
    }
 */
package chap09.generics;
public class GenericsTest {
    public static void main(String[] args) {
        // [1] : Generics 사용하지 않을 경우
        SimpleBox sb = new SimpleBox();
        sb.setObject(33); // 자동 형변환(promotion)이 일어나서 error가 안뜸. Promotion : Integer => Object
        Integer n1 = (Integer) sb.getObject(); // Type Casting (명시적 형변환) : Object => Integer
        System.out.println(n1); // result : 33

        sb.setObject("SMU");
        String s1 = (String) sb.getObject();
        System.out.println(s1); // result : SUM


        // [2] : Generics 사용한 경우
        Box<Integer> gb = new Box<>(); // Type Inference (타입 추론), Generic Type 으로 만드는 것
        gb.setT(33);
        Integer n2 = gb.getT();
        System.out.println(n2); // result : 33

        Box<String> gsb = new Box<>();
        gsb.setT("ICT");
        String s2 = gsb.getT();
        System.out.println(s2); // result : ICT


        // [3] : Raw Type 사용한 경우   !!(사용 X)!!
        Box rawBox = new Box();
        rawBox.setT(22);
        Integer n3 = (Integer) rawBox.getT(); // Casting 해야함.
        System.out.println(n3); // 22
    }
}
/*
                              - Generic의 장점 -
  1. Generic을 사용하면 잘못된 타입이 들어올 수 있는 것을 컴파일 단계에서 방지할 수 있다.
  2. 클래스 외부에서 타입을 지정해주기 때문에 따로 타입을 체크하고 변환해줄 필요가 없다.
     즉, 관리하기 편하다.
  3. 비슷한 기능을 지원하는 경우 코드의 재사용성이 높아진다.
  4. 불필요한 타입 변환 없어 프로그램 성능이 향상된다.
 */

/*
  부모 타입 제한 : <? extends 부모클래스>
  자식 타입 제한 : <? super 자식 클래스>
 */
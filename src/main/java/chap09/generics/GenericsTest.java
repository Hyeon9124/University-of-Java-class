package chap09.generics;

public class GenericsTest {
    public static void main(String[] args) {

        //**[1] : Generics 사용하지 않을 경우**//
        SimpleBox sb = new SimpleBox();
        sb.setObject(33); // 자동형 변환(promotion)이 일어나서 error 가 안뜸. Promotion : Integer => Object
        Integer n1 = (Integer) sb.getObject(); // Type Casting (명시적 형변환) : Object => Integer
        System.out.println(n1);

        sb.setObject("SMU");
        String s1 = (String) sb.getObject();
        System.out.println(s1);


        //**[2] : Generics 사용할 경우**//
        Box<Integer> gb = new Box<>(); // Type Inference (타입 추론), Generic Type 으로 만드는 것
        gb.setT(33);
        Integer n2 = gb.getT();
        System.out.println(n2);

        Box<String> gsb = new Box<>();
        gsb.setT("ICT");
        String s2 = gsb.getT();
        System.out.println(s2);


        //**[3] : Raw Type 사용할 경우**//   !!(사용 X)!!
        Box rawBox = new Box();
        rawBox.setT(22);
        Integer n3 = (Integer) rawBox.getT(); // Casting 해야함.
        System.out.println(n3);

    }
}

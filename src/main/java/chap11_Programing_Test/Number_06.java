package chap11_Programing_Test;
import java.util.HashMap;
import java.util.Map;
public class Number_06 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(); // HashMap 생성
        // key : 한글 동물 이름, value : 소문자 영어 동물 이름을 구성해야 하므로 Generic => String, String

        // HashMap에 데이터 추가 (key, value)
        map.put("호랑이", "tiger");
        map.put("표범", "leopard");
        map.put("사자", "lion");

        System.out.println("변경 전 : " + map); // 변경 전 출력 결과

        map.replaceAll((key, value) -> value.toUpperCase()); // Lambda 사용
        // value.toUpperCase() : value의 모든 값을 대문자로 변환 (Change All Values to Uppercase)
        System.out.println("변경 후 : " + map); // 변경 후 출력 결과
    }
}
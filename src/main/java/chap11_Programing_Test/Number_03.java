package chap11_Programing_Test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.Map;
public class Number_03 {
    public static void main(String[] args) throws IOException { // 입출력 예외 처리(throws IOException)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 키보드로 입력받기 위해 BufferedReader 사용
        
        Map<String, Integer> map = new Hashtable<>();
        // Hashtable 생성, 이름과 점수를 저장하기 위해 Generic => String, Integer 사용
        
        // Hashtable에 데이터 추가 (key, value)
        map.put("김열공", 80);
        map.put("최고봉", 90);
        map.put("우등생", 95);
        map.put("나자바", 88);

        System.out.print("이름을 입력하세요 : "); // 키보드에 이름을 입력을 받기 위해 코드 작성

        String name = br.readLine(); // 이름을 입력

        System.out.println(map.get(name));
        // key(name)에 해당하는 value 값을 출력한다.
    }
}
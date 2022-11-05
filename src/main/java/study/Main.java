package study;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            System.out.print("URL을 입력하세요 : ");

            String s = br.readLine();
            if (s.equals("exit")) {
                break;
            }
            if (s.contains("ac")) {
                sb.append(s + "은 'ac'를 포함합니다.");
            }
            if (s.contains("com")) {
                sb.append(s + "은 'com'으로 끝납니다.");
            }
        }
        System.out.println(sb);
    }
}
package chap02;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = Integer.parseInt(br.readLine());
        int sum = (int) Math.pow(i, 2);

        System.out.println(i + "의 제곱은 : " + sum);
    }
}
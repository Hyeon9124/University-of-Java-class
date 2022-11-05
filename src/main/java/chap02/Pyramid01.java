package chap02;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Pyramid01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++){
            for(int j = i; j < N; j++){
                sb.append(" ");
            }
            for(int k = 0; k < 2 * i - 1; k++){
                sb.append("*");
            }
            sb.append("\n");
        }
        br.close();

        System.out.println(sb);
    }
}
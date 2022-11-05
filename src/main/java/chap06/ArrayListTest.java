package chap06;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
public class ArrayListTest {
    //static ArrayList<Integer> scores = new ArrayList<>();
    static List<Integer> scores = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int data;
        int sum = 0;

        st = new StringTokenizer(br.readLine());
        while((data = Integer.parseInt(st.nextToken())) >= 0){
            scores.add(data);
        }
        for(int i = 0; i < scores.size(); i++){
            sum += scores.get(i);
        }
        System.out.println("평균 : " + (double) sum / scores.size());
    }
}
// 배열의 길이 : length
// 문자열의 길이 : length()
// Collection Framework(ArrayList, Set, Map 등) : size()
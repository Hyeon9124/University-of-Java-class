package chap09.exceptions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class MethodCallStackTest03 {
    public void go() throws IOException{
        // throws : 예외를 처리하지 않고 발생한 예외 객체를 다른 곳으로 떠넘긴다.
        // IOException : 데이터 읽기 같은 입출력 문제가 있을 때 발생
        try {
            BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
            String str = br.readLine();

            System.out.println(str);
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void come() throws IOException{ // come() method에서 예외 떠넘기기 (main 함수로)
        try {
            go();
        } catch (IOException e) {
            throw new RuntimeException(e); // Unchecked Exception
        }
    }
    public static void main(String[] args) {
        // main 함수에서 try ~ catch로 예외처리
        try {
            new MethodCallStackTest03().come(); // main method에 새로운 Constructor를 통해서 new 연산자로 부른다.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
// Checked Exception : 반드시 예외처리를 해줘야함.
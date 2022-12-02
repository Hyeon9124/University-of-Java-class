package chap09.exceptions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class MethodCallStackTest02 {
    public void go() throws IOException {
        // throws : 예외를 처리하지 않고 발생한 예외 객체를 다른 곳으로 떠넘긴다.
        // IOException : 데이터 읽기 같은 입출력 문제가 있을 때 발생
        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));

        String str = br.readLine();
        System.out.println(str);
        br.close();
    }
    public void come(){ // come() method에서 예외 처리를 해준다.
        // try ~ catch로 예외처리
        try {
            go();
        } catch (IOException e) {
            e.printStackTrace(); // printStackTrace(System.err) : Throwable 객체와 추적 정보를 화면에 출력한다.
        }
    }
    public static void main(String[] args) {
        new MethodCallStackTest02().come(); // main method에 새로운 Constructor를 통해서 new 연산자로 부른다.
    }
}
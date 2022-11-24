package chap09.exceptions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class MethodCallStackTest01 {
    public void go(){ // go() method에서 sample.txt 파일을 읽는 작업을 수행함
        // 예외 처리
        try { // 예외가 발생할 수 있는 실행문
            BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
            // FileReader(String fileName)
            String str = reader.readLine(); // 문자열을 입력 받는 코드
            System.out.println(str);
            reader.close();

        } catch (IOException e) { // 핸들러, catch문은 여려 개의 블록이 있을 수 있다.
            e.printStackTrace(); // printStackTrace(System.err) : Throwable 객체와 추적 정보를 화면에 출력한다.
        }
    }
    public void come(){
        go();
    }
    public static void main(String[] args) {
        new MethodCallStackTest01().come(); // main method에 새로운 Constructor를 통해서 new 연산자로 부른다.
    }
}
// ctrl + alt + t : try catch 해야할 영역을 선택후 실행
/*
 -RuntimeExceptions(Unchecked Exception)-
 IndexOutOfBoundsException, NullPointerException
 */
/*
 -CompileTimeException(Checked Exception)-
 InterruptedException, IOException
 */
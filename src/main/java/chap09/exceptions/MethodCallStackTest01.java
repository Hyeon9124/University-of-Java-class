package chap09.exceptions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class MethodCallStackTest01 {
    public void go(){ // go() method에서 sample.txt 파일을 읽는 작업을 수행함
        // 예외 처리
        try { // 예외가 발생할 수 있는 실행문
            BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
            // Project01에 있는 sample.txt 파일을 읽는다.
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
 실행 예외 : 프로그램 실행 도중에 예외가 발생하면 JVM은 해당하는 실행 예외 객체를 생성한다.
 실행 예외는 컴파일러가 예외 처리 여부를 확인하지 않기 때문에 개발자가 예외 처리 코드의 추가 여부를 결정해야 한다.

 대표적인 실행 예외 : IndexOutOfBoundsException, NullPointerException 등
 */

/*
 -CompileTimeException(Checked Exception)-
 일반 예외 : 컴파일러는 일반 예외가 발생할 가능성이 있는 프로그램을 발견하면 컴파일 오류를 발생시킨다.
 따라서 개발자는 이런 프로그램에서는 예외 처리 코드를 반드시 추가해야 한다.
 대표적인 예 : InterruptedException, IOException 등
 */
package chap09.exceptions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class MethodCallStackTest01 {

    public void go(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
            String str = br.readLine();

            System.out.println(str);
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void come(){
        go();
    }

    public static void main(String[] args) {
        new MethodCallStackTest01().come();
    }
}
// ctrl + alt + t
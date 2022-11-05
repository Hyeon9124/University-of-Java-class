package chap02;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class HelloJava {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("Hello Java World!");
        bw.flush();
        bw.close();
    }
}
// ctrl + / : 주석 // 생성, "comment 처리"
// ctrl + D : 바로 윗줄 복사
// ctrl + Z : undo

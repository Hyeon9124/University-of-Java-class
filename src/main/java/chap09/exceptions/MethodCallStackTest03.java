package chap09.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MethodCallStackTest03 {
    public void go() throws IOException{
        try {
            BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
            String str = br.readLine();

            System.out.println(str);
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void come() throws IOException{
        try {
            go();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        try {
            new MethodCallStackTest03().come();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
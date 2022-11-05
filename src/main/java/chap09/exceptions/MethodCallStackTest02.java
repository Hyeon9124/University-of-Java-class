package chap09.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MethodCallStackTest02 {
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
    public void come(){
        try {
            go();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new MethodCallStackTest02().come();
    }
}
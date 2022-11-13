package study;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = new String[]{"사슴", "호랑이", "바다표범", "곰"};
        List<String> list = Arrays.asList(s);

        list.set(1, "다람쥐");

        for(String result : list){
            System.out.print(result + " ");
        }
    }
}
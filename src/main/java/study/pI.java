package study;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Circle_test{
    double pi = 3.14;
    int length;

    void sum(){
        System.out.println("원의 넓이를 구하시오. \n");
    }
}
public class pI {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int value = Integer.parseInt(br.readLine());
        Circle_test circle = new Circle_test();

        circle.sum();
        circle.length = value;

        double total = circle.pi * Math.pow(circle.length, 2);

        System.out.println("반지름의 길이가 " + circle.length + "이면");
        System.out.println(total + "가 원의 넓이 입니다.");
    }
}
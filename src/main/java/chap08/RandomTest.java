package chap08;
import java.util.Random;
public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random(); // Random 객체 생성

        for(int i = 0; i < 5; i++){ // 5개의 숫자를 출력
            System.out.print(r.nextInt(100) + " ");
            // nextInt(100) : 0 ~ 99 사이의 int 타입 난수를 발생시킨다.
        }
    }
}
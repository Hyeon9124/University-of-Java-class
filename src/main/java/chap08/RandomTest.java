package chap08;
import java.util.Random;
public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random(); // Random 객체 생성

        for(int i = 0; i < 5; i++){ // 5개의 숫자를 출력
            System.out.print(r.nextInt(100) + " ");
            // nextInt(100) : 0 ~ 99 사이의 int 타입 난수를 발생시킨다.
            // int nextInt(int bound)
        }
    }
}
/*
  Random 클래스는 변형된 선형 혼합식(liner congruential formula) 알고리즘과 48bit seed를 사용해 난수를 반환한다.
  따라서 동일한 시드를 사용해 생성된 Random 객체는 동일한 난수를 발생한다.

  Random() : Random 객체를 생성한다.
  Random(long seed) : 주어진 시드를 사용하는 Random 객체를 생성한다.
 */
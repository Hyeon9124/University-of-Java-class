package chap05;
public class VarArgsTest {
    // sumFirstExcept() method 작성
    static int sumFirstExcept(int i, int... vars){
        int total = 0;

        for(int v : vars){ // vars 오브젝트를 가져와서 foreach를 실행한다.
            total += v; // total에 vars 값들을 더해준다.
        }
        return total; // total 값 반환
    }
    public static void main(String[] args) {
        System.out.println(sumFirstExcept(1, 2, 3, 4)); // result : 9

        int[] arr = {2, 3};
        System.out.println(sumFirstExcept(1, arr)); // result : 5
        System.out.println(sumFirstExcept(1, 2, 3, 4, 5)); // result : 14
    }
}
/*
  자바 5부터 메서드에도 데이터 타입이 같은 가변 개수(variable length)의 인수를 전달할 수 있다.
  이는 메서드로 전달할 인수의 개수를 정확히 알 수 없을 때 유용하다.
  메서드에서 가변 개수 매개변수를 나타내려면 데이터 타입 뒤에 3개의 dot ...를 붙이면 된다.
  (데이터 타입... 변수)
 */
// 가변 개수 매개변수는 1개만 사용할 수 있다. 자바는 가변 개수 인수를 배열처럼 취급한다.
// 가변 개수 인수를 가진 메서드를 호출하면 자바는 내부적으로 배열을 생성한 후 인수를 배열에 전달해 처리한다.
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
// 가변 개수 매개변수는 1개만 사용할 수 있다. 자바는 가변 개수 인수를 배열처럼 취급한다.
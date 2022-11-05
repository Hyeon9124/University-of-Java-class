package chap06;

public class VarArgsTest {
    // sumFirstExcept() method 작성
    static int sumFirstExcept(int i, int... vars){
        int total = 0;

        for(int v : vars){
            total += v;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstExcept(1, 2, 3, 4));

        int[] arr = {2, 3};
        System.out.println(sumFirstExcept(1, arr));
        System.out.println(sumFirstExcept(1, 2, 3, 4, 5));
    }
}
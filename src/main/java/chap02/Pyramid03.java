package chap02;
public class Pyramid03 {
    public static void main(String[] args) {
        int i, j, k; // 필요한 변수 선언
        int num = 10;

        for(i = 0; i <= num; i++){ // num만큼 반복 실행
            for(j = 0; j < num - i; j++){ // num - i만큼 공백 출력
                System.out.print(" ");
            } // j
            for(k = 0; k < 2 * i + 1; k++){
                System.out.print("*"); // 2k + 1개를 차례대로 출력
            } // k
            System.out.println(); // 다음줄로 넘어감
        } // i
    }
}
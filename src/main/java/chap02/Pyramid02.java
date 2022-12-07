package chap02;
public class Pyramid02 { // 피라미드의 절반만 출력
    public static void main(String[] args) {
        int i, j;
        // Ctrl + / : Comment 처리 (주석 처리)
        // Ctrl + z : undo
        for(i = 1; i <= 5; i++){ // 입력된 수만큼 반복문 실행
            for(j = 0; j < i; j++){
                System.out.print("*"); // i개 만큼 * 출력
            }
            System.out.println(); // 다음줄로 넘어감
        }
    }
}
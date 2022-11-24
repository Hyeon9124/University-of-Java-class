package chap02;
public class Pyramid02 { // 피라미드의 절반만 출력
    public static void main(String[] args) {
        // Ctrl + / : Comment 처리 (주석 처리)
        // Ctrl + z : undo
        for(int i = 1; i <= 5; i++){ // 입력된 수만큼 반복문 실행
            for(int j = 0; j < i; j++){
                System.out.print("*"); // i보다 작은 수만큼 * 출력
            }
            System.out.println(); // 다음줄로 넘어감
        }
    }
}
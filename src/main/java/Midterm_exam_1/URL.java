package Midterm_exam_1;
import java.util.Scanner;
public class URL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){ // exit을 입력받기 전까지 반복문 실행
            System.out.print("URL을 입력하세요 : ");

            String s = sc.nextLine(); // URL 입력

            if(s.equals("exit")){ // 입력받은 URL이 exit 이면 while문 종료
                break;
            }
            if(s.contains("ac")){   // 입력받은 URL이 ac를 포함하면
                System.out.println(s + "은 'ac'를 포함합니다."); 
            }
            if(s.endsWith("com")){ // 입력받은 URL이 com으로 끝나면
                System.out.println(s + "은 'com'으로 끝납니다.");
            }
        }
    }
}
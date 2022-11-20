package chap11_Programing_Test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Number_05 {
    public static void main(String[] args) throws IOException { // 입출력 예외 처리(throws IOException)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 키보드로 입력 받기 위해 BufferedReader 사용
        StringBuilder sb = new StringBuilder(); // StringBuilder로 출력에 필요한 데이터를 한 번에 출력하기 위해 사용

        ArrayList<Integer> list = new ArrayList<>(); // ArrayList 생성, 학생들 점수를 저장하기 위해 Generic => Integer

        while(true){ // 음수 값이 나오기 전까지 while문 실행
            System.out.print("점수를 입력하세요 : ");
            int score = Integer.parseInt(br.readLine()); // 학생 점수 입력

            if(score < 0) break; // 입력된 정수 값이 음수이면 break
            list.add(score); // 입력 받은 학생 점수를 ArrayList에 추가
        }
        sb.append("전체 학생은 " + list.size() + "명이다." + "\n"); // StringBuilder에 학생의 수를 추가
        sb.append("학생들의 성적 : ");

        int max = -1; // 최고 점수(max)를 적절한 값으로 초기화

        for(int i = 0; i < list.size(); i++) { // ArrayList size()만큼 반복문 실행
            sb.append(list.get(i) + " ");   // 학생들의 성적을 StringBuilder에 추가
            max = Math.max(max, list.get(i)); // ArrayList에 저장되어 있는 값들 중 최대값(max)을 찾는 코드
        }
        sb.append("\n"); 

        for(int i = 0; i < list.size(); i++) { // ArrayList size()만큼 반복문 실행
            sb.append(i); // i번째 학생 번호를 저장

            if(list.get(i) >= max - 10){ // (max - 10)점 이상은 A등급
                sb.append("번 학생의 성적은 " + list.get(i) + "점이며 등급은 A이다." + "\n");
            }
            else if(list.get(i) >= max - 20 && list.get(i) < max - 10){
                // (max - 20) 이상 (max - 10) 미만은 B등급
                sb.append("번 학생의 성적은 " + list.get(i) + "점이며 등급은 B이다." + "\n");
            }
            else if(list.get(i) >= max - 30 && list.get(i) < max - 20){
                // (max - 30) 이상 (max - 20) 미만은 C등급
                sb.append("번 학생의 성적은 " + list.get(i) + "점이며 등급은 C이다." + "\n");
            }
            else if(list.get(i) >= max - 40 && list.get(i) < max - 30){
                // (max - 40) 이상 (max - 30) 미만은 D등급
                sb.append("번 학생의 성적은 " + list.get(i) + "점이며 등급은 D이다." + "\n");
            }
            else{ // 전부 아니면 F등급
                sb.append("번 학생의 성적은 " + list.get(i) + "점이며 등급은 F이다." + "\n");
            }
        }
        System.out.println(sb); // StringBuilder에 있는 데이터 출력
    }
}
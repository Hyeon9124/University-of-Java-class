package chap11_Programing_Test;
import java.util.ArrayList;
public class Number_01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); // ArrayList 생성, 동물 이름을 저장하기 위해 Generic => String 사용
        StringBuilder sb = new StringBuilder(); // StringBuilder를 통해 ArrayList 원소 중 문자열 크기가 2인 단어를 추가

        // 갈매기, 나비, 다람쥐, 라마를 ArrayList에 add
        list.add("갈매기");
        list.add("나비");
        list.add("다람쥐");
        list.add("라마");

        // ArrayList의 size()만큼 반복 실행
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).length() == 2){ // list의 원소들 중에서 문자열 크기가 2인 단어를 찾는 if문
                sb.append(list.get(i) + " "); // 있으면 append를 사용해 StringBuilder에 추가
            }
        }
        System.out.println(sb); // list의 원소들 중에서 문자열 크기가 2인 단어들을 출력
    }
}
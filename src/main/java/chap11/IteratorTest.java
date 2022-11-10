package chap11;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Collection<String> list =  Arrays.asList("다람쥐", "개구리", "나비", "고양이"); // 객체를 리스트 타입으로 변경

        // [1]
        Iterator<String> iterator = list.iterator(); // Collection의 index를 하나씩 가져온다. (list.iterator)

        while(iterator.hasNext()){ // true, false로 나옴
            // iterator는 1번만 사용 가능함 같은 코드를 2번 이상 못씀
            System.out.print(iterator.next() + " ");
        }
        /*  아래와 같은 코드를 쓸 수 없음. (한번만 가능)
        while(iterator.hasNext()){ =
            System.out.print(iterator.next() + " ");
        }
         */

        System.out.println();

        // [3]
        // iterator를 호출해야함
        while(iterator.hasNext()){ 
            System.out.print(iterator.next() + "###");
        }
        
        // [4] : foreach로도 출력 가능함
        for(String s : list){
            System.out.print(s + " ");
        }

    }
}

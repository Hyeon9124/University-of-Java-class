package chap11;
import java.util.LinkedList;
import java.util.Queue;

/** Queue에서 offer() 메서드는 false를 반환하고,  poll(), peek() 메서드를 호출하면  단순히 null 값만 반환한다
 * Queue를 사용할 때는 offer(), poll(), peek() 메서드를 사용하는 것이 좋다. **/

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>(); // Queue : interface
        // Queue에서 offer 대신 add를 쓰면 반드시 예외처리를 해줘야함

        // [1]
//        q.remove(); // error code

        // [2]
        System.out.println(q.poll()); // null로 출력 --> false

        q.offer("사과");
        System.out.println("지금 바나나가 추가되었나요? " + q.offer("바나나")); // true 값으로 출력

        // add를 사용할 때 try ~ catch로 예외처리를 해줘야함
        // 사용 X, offer() 사용할 것
        try {
            q.add("체리");
        } catch (IllegalStateException e) {
            // IllegalStateException : RuntimeException의 종류.. 메서드에 부적절한 인수를 전달할 때 발생함.
            e.printStackTrace();
        }
        System.out.println("head 엿보기 : " + q.peek()); // 사과 출력
    }
}
/** Queue는 Stack과 다르게  false, null 값을 반환하는 메서드가 존재한다 **/
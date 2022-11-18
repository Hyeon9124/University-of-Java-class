package chap11;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> st1 = new Stack<>(); // Stack은 Class이다.  Generic class인데 default Constructor

        // 스택에 사과, 바나나, 체리 순으로 들어가 있음
        st1.push("사과");
        st1.push("바나나");
        st1.push("체리");

        // 스택에 제일 위에 있는 데이터 확인 : peek()
        System.out.println(st1.peek()); // 체리 출력

        // pop() 할 때 마다 스택의 제일 위에 있는 데이터가 출력됨
        System.out.println(st1.pop()); // stack에서 체리를 pop()하고 데이터 출력
        System.out.println(st1.peek()); // 바나나 출력
        System.out.println(st1.pop()); // stack에서 바나나를 pop()하고 데이터 출력


    }
}

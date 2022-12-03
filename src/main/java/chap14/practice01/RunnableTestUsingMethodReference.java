package chap14.practice01;
public class RunnableTestUsingMethodReference {
    public void doSomething() { // return 값 없는 method 생성
        for(int i = 0; i < 10; i++){
            System.out.println(i);

            try { // 예외 처리
                Thread.sleep(1000); // 1초 동안 일시 정지 상태
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        // Instance Method Reference
        new Thread(new RunnableTestUsingMethodReference()::doSomething).start();

        /*
          Java 8에 도입된 메서드 참조는 class::methodName 구문을 사용하여 클래스 또는 객체에서 메서드를 참조할 수 있다.
         */

        /* 메소드 참조(method reference)는 람다 표현식이 단 하나의 method만을 호출하는 경우에 해당 람다 표현식에서
           불필요한 매개변수를 제거하고 사용할 수 있도록 해준다.
           세미콜론 두개(::)로 method를 참조할 수 있다.
        */
    }
}
// Runnable - > Functional Interface

/*
                      종류                                                  예시
   static method 참조                                          ContainingClass::staticMethodName
   특정 객체의 인스턴스 method 참조                              containingObject::instanceMethodName
   특정 유형의 임의의 객체에 대한 인스턴스 method 참조             ContainingType::methodName
   생성자 참조                                                  ClassName::New

 */
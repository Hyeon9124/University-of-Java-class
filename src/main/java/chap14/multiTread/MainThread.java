package chap14.multiTread;
public class MainThread {
    public static void main(String[] args) {
        // (1) Thread Class 실행하는 방법
        ThreadA tha = new ThreadA(); // ThreadA Object 생성
        // 모든 자바 애플리케이션은 적어도 main Thread를 가진다.
        // run()가 되는 순간 return이 되고 다음 코드를 실행.. 중간중간에 Multi Thread가 된다.


        // (2) Runnable Interface를 실행하는 방법
//        Runnable r = new ThreadB(); // Runnable에는 start() method가 없다.
//        Thread thb = new Thread(r);
        Thread thb = new Thread(new ThreadB()); // 위의 두줄 코드 보다 깔끔함

        // start() method : Thread 클래스의 start() method를 호출하면 Thread가 실행된다.
        tha.start();
        thb.start();

        for(int i = 0; i < 10; i++){
            System.out.println("main thread : " + i);

            // ctrl + alt + t
            try { // 예외 처리를 안하면 컴파일을 할 수 없다.
                Thread.sleep(1000); // millis – the length of time to sleep in milliseconds
                // InterruptedException을 Checked Exception을 해주지 않으면 error 발생한다.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
// Runnable Interface, Thread Class : Java.lang 패키지에 포함되어 있다. -> import 필요 X
// Thread 자식 객체를 생성하거나 Runnable 구현 객체로 Thread 객체를 생성하는 이유는 단일 상속 한계를 극복하기 위함이다.

/*
  Thread() : Thread 객체를 생성한다.
  Thread(Runnable target) : Runnable 구현 객체를 사용해 Thread 객체를 생성한다.
  Thread(Runnable target, String name) : Runnable 구현 객체를 사용해 Thread 이름이 name인 Thread 객체를 생성한다.
 */
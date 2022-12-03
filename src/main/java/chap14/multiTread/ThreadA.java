package chap14.multiTread;

// [1] : Thread Class를 Inheritance 하는 방법

public class ThreadA extends Thread{ // Thread를 상속
    // Alt + Insert
    // Override Methods... run() method를 사용한다.
    @Override
    public void run() { // 오버라이딩을 이용해 run() method 호출
        for(int i = 0; i < 10; i++){
            System.out.println("ThreadA : " + i);

            try { // 예외처리
                Thread.sleep(1000); // 1초 동안 일시 정지 상태
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
// Thread를 메모리로 올리는 방법은 run() methode를 오버라이딩을 해야한다.
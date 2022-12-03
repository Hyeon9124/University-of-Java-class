package chap14.multiTread;

// [2] : Runnable Interface로 구현하는 방법
/** 중요함!! **/

public class ThreadB implements Runnable{ // Functional Interface
    @Override
    public void run() { // Runnable은 반드시 오버라이딩을 해야한다.
        for(int i = 0; i < 10; i++){
            System.out.println("ThreadB : " + i);

            try { // 예외 처리
                Thread.sleep(500); // 0.5초 동안 일시 정지 상태
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
//@FunctionalInterface
//public interface Runnable {
//    /**
//     * When an object implementing interface <code>Runnable</code> is used
//     * to create a thread, starting the thread causes the object's
//     * <code>run</code> method to be called in that separately executing
//     * thread.
//     * <p>
//     * The general contract of the method <code>run</code> is that it may
//     * take any action whatsoever.
//     *
//     * @see     java.lang.Thread#run()
//     */
//public abstract void run();
//}

// Runnable Interface의 유일한 멤버는 run() method이다. 따라서 Runnable 구현 클래스는 run() method를 구현해야 한다.
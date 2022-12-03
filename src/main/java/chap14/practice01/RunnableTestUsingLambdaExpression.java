package chap14.practice01;
public class RunnableTestUsingLambdaExpression {
    public static void main(String[] args) {
        // [1] : Anonymous Class 구현
        Runnable r1 = new Runnable() { // run() method가 생성되고 오버라이딩이 된다.
            @Override
            public void run() {
                for(int i = 0; i < 10; i++){
                    System.out.println(i);

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }; // ; -> Anonymous Class를 뜻함
        new Thread(r1).start(); // 이 코드는 아래의 Comment와 같다.
        /*
         Thread th1 = new Thread(r1);
         th1.start();
        */


        // [2] : Lambda Expression 구현
        // Lambda로 쓰는 방법을 많이 연습해야함.
        Runnable r2 = () -> {
            for(int i = 0; i < 10; i++){
                System.out.println(i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        /*
        1. new Runnable() 사용 X
        2. Lambda Expression 으로 구현하면 오버라이딩을 안해도 된다.
        3. run() method도 필요 X
         */
        new Thread(r2).start(); // 이 코드는 아래의 Comment와 같다.
        /*
         Thread th2 = new Thread(r2);
         th2.start();
        */

        // [3] : Runnable Interface 직접 구현하는 방법
        new Thread(() -> {
            for(int i = 0; i < 10; i++){
                System.out.println(i);

                try {
                    Thread.sleep(1000); // 1초 동안 일시 정지 상태
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        // 최종은 Lambda Expression으로 되어있다.
    }
}
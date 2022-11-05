package chap04;

public class Dog extends Animal{

    @Override
    public void move() {
        System.out.println("강아지가 움직입니다.");
    }

    @Override
    public void sound() {
        System.out.println("강아지가 멍멍이라고 웁니다. ~~멍멍~~");
    }

    public void dogAtti(){
        System.out.println("강아지는 꼬리를 흔드는 하는 특징이 있습니다.");
    }
}

package chap04;

public class Tiger extends  Animal{

    @Override
    public void move() {
        System.out.println("호랑이가 움직입니다.");
    }

    @Override
    public void sound() {
        System.out.println("호랑이가 어흥이라고 웁니다. ~~어흥~~");
    }

    public void tigerAtti(){
        System.out.println("호랑이는 꽂감을 좋아하는 특징이 있습니다.");
    }
}

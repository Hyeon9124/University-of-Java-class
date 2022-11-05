package chap04;

public class Cat extends Animal{

    @Override
    public void move() {
        System.out.println("고양이가 움직입니다.");
    }

    @Override
    public void sound() {
        System.out.println("고양이가 야옹이라고 웁니다. ~~야옹~~");
    }

    public void catAtti(){
        System.out.println("고양이는 그루밍을 하는 특징이 있습니다.");
    }
}
// ctrl + o : 오버라이딩

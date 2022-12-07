package chap04;
public class Dog extends Animal{ // Dog Class는 extends로 Animal Class를 상속 받음
    @Override // 재정의
    public void move() { // move() method
        System.out.println("강아지가 움직입니다.");
    }
    @Override // 재정의
    public void sound() { // sound() method
        System.out.println("강아지가 멍멍이라고 웁니다. ~~멍멍~~");
    }
    public void dogAtti(){ // dogAtti() method
        System.out.println("강아지는 꼬리를 흔드는 하는 특징이 있습니다.");
    }
}
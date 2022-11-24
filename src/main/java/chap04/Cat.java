package chap04;
public class Cat extends Animal{ // Cat Class는 extends로 Animal Class를 상속 받음
    @Override // 재정의
    public void move() { // move() method
        System.out.println("고양이가 움직입니다.");
    }
    @Override // 재정의
    public void sound() { // sound() method
        System.out.println("고양이가 야옹이라고 웁니다. ~~야옹~~");
    }
    public void catAtti(){ // catAtti() method
        System.out.println("고양이는 그루밍을 하는 특징이 있습니다.");
    }
    // 접근할 수 있도록 public으로 설정
}
// ctrl + o : 오버라이딩
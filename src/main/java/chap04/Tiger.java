package chap04;
public class Tiger extends  Animal{ // Tiger Class는 extends로 Animal Class를 상속 받음
    @Override // 재정의
    public void move() { // move() method
        System.out.println("호랑이가 움직입니다.");
    }
    @Override // 재정의
    public void sound() { // sound() method
        System.out.println("호랑이가 어흥이라고 웁니다. ~~어흥~~");
    }
    public void tigerAtti(){ // tigerAtti() method
        System.out.println("호랑이는 꽂감을 좋아하는 특징이 있습니다.");
    }
    // 접근할 수 있도록 public으로 설정
}
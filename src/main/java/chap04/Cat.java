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
}
// ctrl + o : 오버라이딩

/*
 캡슐화(encapsulation)는 관련 필드와 메서드를 하나의 캡슐처럼 포장해 세부 내용을 외부에서 알 수 없도록 감추는 것이다.
 캡슐화를 정보은닉(information hiding)이라고도 한다.
 캡슐화의 주목적은 내부 데이터를 숨겨서 외부 영향을 받지 않도록 하는 것이다.
 */

/*
  inheritance(상속) :
  객체 지향 프로그래밍에서는 상위 객체(부모)를 상속받은 하위 객체(자녀)가 상위 객체(부모)의 필드와 메서드를 사용할 수 있다.
  자식 클래스는 부모 클래스의 필드와 메서드를 사용할 수 있으며, 자신에 맞게 수정하거나 새로 추가할 수도 있다.
 */

/* Polymorphism(다형성) : 대입되는 객체에 따라서 메서드를 다르게 동작하도록 구현하는 기술이다.
 실행 도중 동일한 이름의 다향한 구현체 중에서 각각의 메서드를 선택할 수 있다.
 Animal Class의 move() method, sound() method에서 동일한 명령을 내려도 객체의 종류에 따라 다른 결과가 나타나도록 하는
 프로그래밍 기술이 다형성이다.
 */

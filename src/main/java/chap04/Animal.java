package chap04;
public class Animal { // Animal Class
    // 접근할 수 있도록 public으로 설정
    public void move(){ // move() method
        System.out.println("동물들은 각자의 움직임이 다릅니다..");
    }
    // 접근할 수 있도록 public으로 설정
    public void sound() { // sound() method
        System.out.println("동물들은 각자의 소리가 다릅니다..");
    }
}
/*
 객체(Object) : 현실 세계에서 구체적이거나 추상적인 사물(개념)을 의미한다.
 구체적인 예 : 인간, 자동차, 램프 등이 있다.
 추상적인 예 : 축구, 강의, 직장 등이 있다.

 객체는 state(상태)와 behavior(동작)으로 구성되어 있다.
 소프트웨어 객체는 상태를 field로 정의하고, 동작을 method로 정의한다.
 field : 객체를 통하여 사용할 수 있는 변수이다.
 method : 객체를 통하여 호출할 수 있는 동작이다.
 소프트웨어 객체는 현실 세계의 객체를 field와 method로 모델링한 것이다.
 */

/*
 객체 지향 프로그래밍 (OOP : Object-Oriented Programming)
 객체 지향 프로그래밍의 클래스가 동일한 객체를 생산하는 틀이나 설계도에 해당
 (예 : 붕어빵을 만들기 위해 밀가루 반죽, 앙금 등 재료가 필요하고 붕어빵 형틀도 있어야 한다.)

 클래스라는 틀로 만든 객체가 해당 클래스의 instance이다.
 예를 들어 붕어빵은 붕어빵틀의 instance다. 클래스에서 객체를 생성하는 과정을 인스턴스화라고 한다.
 */

/*
  abstraction(추상화) : 현실 세계의 객체에서 불필요한 속성을 제거하고 중요한 정보만 클래스로 표현하는 일종의 모델링 기법이다.
  따라서 사람마다 추상화하는 기법이 같지 않으므로 각 개발자는 클래스를 다르게 정의할 수 있다.
 */
package chap06;
class Animal{ // Animal Class
    // Constructor
    public Animal(String s) {
        System.out.println(s);
    }
}
class Mammal extends Animal{
    // Default Constructor
    public Mammal() {  // super()의 순서가 중요함!
        super("고양이");
        System.out.println("포유류 : 고양이");
    }
    // Parent Constructor
//    public Mammal(String s) {
//        super(s);
//        System.out.println("");
//    }
}
public class AnimalTest {
    public static void main(String[] args) {
        Mammal ape = new Mammal();
    }
}
// 멤버 field와 method는 inheritance가 된다.
// Constructor는 Class 멤버가 아니다. ( 필드 + 메서드 = 멤버)

/*
  - 상속 선언 -
  자식 클래스는 부모 클래스부터 확장된다는 의미로 extends 키워드를 사용햐 상속 관계를 선언한다.

  class (자식 클래스 이름) extends (부모 클래스 이름){
     // 멤버
  }

 */

/*
  부모 클래스에 있는 다음 메서드를 자식 클래스가 오버라이딩 할 수 없다.
  1. private method : 부모 클래스 전용이므로 자식 클래스에 상속되지 않는다.
  2. static method : 클래스 소속이므로 자식 클래스가 오버라이딩 할 수 없다.
  3. final method : final 메서드는 더 이상 수정될 수 없으므로 자식 클래스가 오버라이딩 할 수 없다.

  오버라이딩된 메서드 앞에는 @Override 어노테이션(annotation)이 있는 코드를 볼 수 있다.
  @Override 뒤에 선언된 메서드가 부모 클래스의 메서드를 오버라이딩한 메서드라는 것을 명시한다.
  @Override는 오버라이딩 규칙에 어긋나면 컴파일 오류를 발생시키기 때문에 개발자가 흔히 범하는 실수를 사전에 방지할 수 있다.
 */
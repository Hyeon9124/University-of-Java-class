package chap06;
class Car { // Car Class
    public Car(String model){ // String type의 model
        // 부모의 생성자는 자식은 inheritance가 안된다.
        System.out.println(model);
    }
}
class SportsCar extends Car{ // Child Class
    public SportsCar(){ // Default Constructor
        super("SONATA"); // 부모 생성자 호출
        System.out.println("Sports Car!!");
    }
}
// Default Constructor : 매개변수가 없는 생성자, 생성자가 하나도 없을 때 컴파일러가 자동 추가한다.
public class CarTest {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
    }
}
/*
  자식 클래스가 메서드를 오버라이딩하면 자식 객체는 부모 클래스의 오버라이딩된 메서드를 숨긴다.
  필요에 따라 숨겨진 메서드를 호출해야 할 때가 있는데, 이때 supper 키워드를 사용한다.

  super는 현재 객체에서 부모 클래스의 참조를 의미하므로 자식 객체는
  super 키워드를 사용해 부모 객체의 메서드나 필드에 접근할 수 있다.
 */

/*
  생성자는 클래스 멤버가 아니므로 자식 클래스에 상속되지 않는다. 하지만 부모에게서 물려받은 멤버가 있다면 자식 클래스는
  이를 초기화 하기 위해 부모 클래스의 생성자가 필요하다.

  자식 생성자를 호출하면 부모 생성자도 자동으로 호출된다.
 */
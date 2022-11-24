package chap06;
class Car { // Car Class
    public Car(String model){ // String type의 model
        // 부모의 생성자는 자식은 inheritance가 안된다.
        System.out.println(model);
    }
}
class SportsCar extends Car{ // Child Class
    public SportsCar(){ // Default Constructor
        super("SONATA");
        /*
        super는 현재 객체에서 부모 클래스의 참조를 의미하므로 자식 객체는
        super 키워드를 사용해 부모 객체의 메서드나 필드에 접근할 수 있다.
        */
        System.out.println("Sports Car!!");
    }
}
// Default Constructor : 매개변수가 없는 생성자, 생성자가 하나도 없을 때 컴파일러가 자동 추가한다.
public class CarTest {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
    }
}
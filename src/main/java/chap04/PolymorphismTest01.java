package chap04;
public class PolymorphismTest01 {
    public static void main(String[] args) {

        // (1)
        /*Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Tiger tiger = new Tiger();
        */

        // UpCasting : 자식 클래스의 객체가 부모 클래스 타입으로 형변환 되는 것이다.
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal tiger = new Tiger();

        // DownCasting : 업캐스팅과 반대로 캐스팅 하는 것을 다운캐스팅이라고 한다.
        Cat tmp = (Cat) cat;
        // 부모 클래스 = 자식 클래스 이므로 (Cat)을 붙여준다.
        System.out.println(cat.toString());
        System.out.println(tmp.toString());
        // 오버라이딩을 안하면 주소값이 나오고 cat과 tmp의 주소값은 같음

        System.out.println(cat instanceof Dog);
        System.out.println(cat instanceof Cat);
        // instanceof : 객체 타입을 확인하는 연산자이다.
        // 형반환 가능 여부를 확인하며 true / false로 결과를 반환한다.
        // 주로 상속 관계에서 Parent Object 인지 Child Object 인지 확인하는데 사용된다.
        System.out.println(tmp);
        System.out.println();

        cat.move();
        cat.sound();
        System.out.println();

        dog.move();
        dog.sound();
        System.out.println();

        tiger.move();
        tiger.sound();
    }
}
// dot + method 필드가 있으면 dot + field
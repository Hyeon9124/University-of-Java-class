package chap04;

public class PolymorphismTest01 {

    public static void main(String[] args) {

        /*Animal animal = new Animal(); // (1)
        Cat cat = new Cat();
        Dog dog = new Dog();
        Tiger tiger = new Tiger();*/

        // UpCasting -- 매우 중요하니 잘 알아둘 것!!!!!!!!!!!
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal tiger = new Tiger();

        // DownCasting
        Cat tmp = (Cat) cat;
        // 부모 클래스 = 자식 클래스 이므로 (Cat)을 붙여준다.
        System.out.println(cat.toString());
        System.out.println(tmp.toString());
        // 오버라이딩을 안하면 주소값이 나오고 cat과 tmp의 주소값은 같음

        System.out.println(cat instanceof Dog);
        System.out.println(cat instanceof Cat);
        System.out.println(tmp);
//        System.out.println();

//        cat.move();
//        cat.sound();
//        System.out.println();
//
//        dog.move();
//        dog.sound();
//        System.out.println();
//
//        tiger.move();
//        tiger.sound();

    }
}
// dot + method  필드가 있으면 dot +field
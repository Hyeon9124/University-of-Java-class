package chap04;
public class PolymorphismTest02 {
    public static void main(String[] args) {

        // UpCasting
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal tiger = new Tiger();

        // Java의 arr는 Object이다.
        Animal[] animals = new Animal[]{cat, dog, tiger};

        // (1) for문
//        for (int i = 0; i < animals.length; i++) {
//            animals[i].move(); // arr 기호를 붙여 쓰기 때문에 foreach 사용하는 것이 좋음
//        }

        // (2) 향상된 for -> foreach
        for (Animal ict02a : animals) {
            ict02a.move();
            ict02a.sound();
            System.out.println();
        }
    }
}
/*
  - 필드와 메서드 접근 -
  객체참조변수.멤버 -> 객체 멤버에 접근하려면 (.)를 이용해야 한다.

  객체참조변수.필드 : instance variable
  객체참조변수.메서드 : instance method

 */
package chap04;
public class PolymorphismTest02 {
    public static void main(String[] args) {

        // UpCasting
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal tiger = new Tiger();

        // Java의 arr는 Object이다.
        Animal[] animals = new Animal[]{cat, dog, tiger};

        // (1) for
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
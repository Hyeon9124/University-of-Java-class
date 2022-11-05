package chap04;

public class PolymorphismTest02 {

    public static void main(String[] args) {

        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal tiger = new Tiger();


        Animal[] animals = new Animal[]{cat, dog, tiger};
        // (1) for
//        for (int i = 0; i < animals.length; i++) {
//            animals[i].move();
//        }

        // (2) 향상된 for -> foreach
        for (Animal ict02a : animals) {
            ict02a.move();
            ict02a.sound();
            System.out.println();
        }
    }
}
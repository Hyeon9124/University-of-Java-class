package chap06;

class Animal{
    public Animal(String s) {
        System.out.println(s);
    }
}

class Mammal extends Animal{
    // Default Constructor
    public Mammal() {
        super("원숭이");
        System.out.println("포유류");
    }

    // Parent Constructor
    public Mammal(String s) {
        super(s);
        System.out.println("");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Mammal ape = new Mammal();

    }
}

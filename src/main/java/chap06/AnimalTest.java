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
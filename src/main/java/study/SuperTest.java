package study;

class Car{
    public Car(String s) {
        System.out.println(s);
    }
}
class superCar extends Car{
    public superCar() {
        super("벤츠");

        System.out.println("자동차");
    }
}
public class SuperTest {
    public static void main(String[] args) {
        superCar sc = new superCar();

    }
}

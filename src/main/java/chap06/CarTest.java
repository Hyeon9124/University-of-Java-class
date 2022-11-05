package chap06;

class Car {
    public Car(String model){
        System.out.println(model);
    }
}

class SportsCar extends Car{
    public SportsCar(){
        super("SONATA");
        System.out.println("Sports Car!!");
    }
}

public class CarTest {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();

    }
}

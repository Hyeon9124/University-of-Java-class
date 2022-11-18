package midterm_exam_4;

class Vehicle {
    String color;
    int speed;

    public Vehicle(String color, int speed) { // Constructor
        // field 초기화
        this.color = color;
        this.speed = speed;
    }

    void show(){
        System.out.println("색상 : " + color + ", 속도 : " + speed);
    }
}
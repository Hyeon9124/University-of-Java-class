package midterm_exam_4;

class Car extends Vehicle{ // extends를 사용해 상속관계 선언
    int displacement;
    int gears;

    public Car(String color, int speed, int displacement, int gears) { // Constructor
        super(color, speed); // 부모 클래스의 Constructor 호출
        // field 초기화
        this.displacement = displacement;
        this.gears = gears;
    }

    void show(){
        System.out.println("색상 : " + color + ", 속도 : " + speed + ", 배기량 : " + displacement + ", 기어 단수 : " + gears);
    }
}

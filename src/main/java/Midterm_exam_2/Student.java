package Midterm_exam_2;
public class Student extends Person{ // extends를 사용해 상속관계 선언
    long number;

    public Student(String name, int age, long number) {
        super(name, age);
        this.number = number;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    String show() {
        return ("학생[이름 : " + name + ", 나이 : " + age +", 학번 : " + number + "]");
    }
}
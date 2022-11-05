package Midterm_exam_2;
public class ForeignStudent extends Student{ // extends를 사용해 상속관계 선언
    String nationality;

    public ForeignStudent(String name, int age, long number, String nationality) {
        super(name, age, number); // 부모 클래스의 Constructor 호출
        this.nationality = nationality; // field 초기화
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    String show() {
        return ("외국학생[이름 : " + name + ", 나이 : " + age +", 학번 : " + number + ", 국적 : " + nationality + "]");
    }
}
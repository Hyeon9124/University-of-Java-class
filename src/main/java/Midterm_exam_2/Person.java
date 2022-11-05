package Midterm_exam_2;
class Person{
    String name;
    int age;

    public Person(String name, int age) { // Constructor
        // field 초기화
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    String show(){
        return ("사람[이름 : " + name + ", 나이 : " + age + "]");
    }
}
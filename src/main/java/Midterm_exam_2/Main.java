package Midterm_exam_2;
public class Main {
    public static void main(String[] args) {
        Person[] phones = new Person[]{new Person("ict01", 20), new Student("ict02", 21, 2022222222),
            new ForeignStudent("ict03", 22, 202111111, "Malaysia")};

        for(Person result : phones){ // foreach를 사용해 출력
            System.out.println(result.show());
        }
    }
}
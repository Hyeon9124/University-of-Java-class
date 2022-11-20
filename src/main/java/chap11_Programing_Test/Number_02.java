package chap11_Programing_Test;
import java.util.*;
public class Number_02 {
    static class Person{ // Person class
        // field
        String name; // 이름
        int age; // 나이

        // Alt + Ins로 Constructor, equals() and hashCode() method, toString() method를 생성
        
        // Constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // 중복 여부를 equals() and hashCode() 통해서 판단
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age && name.equals(person.name);
        }
        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        // 이름과 나이를 반환하도록 toString() 사용
        @Override
        public String toString() {
            return "Person[" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ']';
        }
    }
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>(); // HashSet 생성, Generic => 이름과 나이가 저장되어 있는 Person Class를 사용한다.

        // Set에 데이터 추가 (key, value)
        set.add(new Person("김열공", 20));
        set.add(new Person("최고봉", 56));
        set.add(new Person("우등생", 16));
        set.add(new Person("나자바", 35));

        // foreach() 문을 사용하여 이름과 나이를 출력
        // Set은 순서가 없기 때문에 프로그래밍 문제 예시 답과 다르게 나올 수 있음.
        set.forEach((Person) -> System.out.println(Person.name + " : " + Person.age)); // Lambda 사용하여 출력

        // Iterator(반복자)를 사용하여 HashSet의 Collection 원소를 출력한다.
        Iterator<Person> itr = set.iterator(); // Set<E>이 Person class이므로 Iterator도 Person을 넣어준다.

        while(itr.hasNext()){ // 다음 위치에 원소가 있는지 조사
            Person p = itr.next(); // Person 다음 위치 원소를 가져오고 다음 위치로 이동한다.
            System.out.print("Person[" + p.name + ", " + p.age + "] "); // HashSet의 Collection 원소를 출력
        }
    }
}
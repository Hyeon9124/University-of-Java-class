package chap11;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
public class SetTest2 {
    static class Fruit{ // Fruit이라는 class는 DataBase에 있는 table과 Mapping 되어 있음
        String name; // field

        // [1] : Constructor
        public Fruit(String name) {
            this.name = name;
        }

         // [2] : equals() and hashcode()
        /** hashcode() 와 equals() 둘 다 있어야 중복을 걸러낼 수 있다.
         * 둘 중에 한 개라도 없으면 중복을 걸러낼 수 없다!! -- ★ 매우 중요 ★

         * Set Interface에서 가장 중요한 부분 **/
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Fruit fruit = (Fruit) o;
            return name.equals(fruit.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        // toString() method는 객체가 가지고 있는 정보나 값들을 문자열로 만들어 return하는 메소드 이다.
        @Override
        public String toString() {
            return "Fruit{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        Set<Fruit> fruits = new HashSet<>();

        // Ctrl + d : 위의 줄 복사 붙여넣기
        fruits.add(new Fruit("사과"));
        fruits.add(new Fruit("사과"));

        System.out.println(fruits.size());
        System.out.println(fruits); // hashcode
        
        // (1) hashConde() 와 equals() method가 없는 경우
        // 2
        //[Fruit{name='사과'}, Fruit{name='사과'}]

        // (2) hashConde() 와 equals() method가 있는 경우
        //  1
        //[chap11.SetTest2$Fruit@1801ef]
    }
}
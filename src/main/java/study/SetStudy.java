package study;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetStudy {
    static class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Test test = (Test) o;
            return name.equals(test.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "Test[" +
                    "name='" + name + '\'' +
                    ']';
        }
    }
    public static void main(String[] args) {
        Set<Test> set = new HashSet<>();

        set.add(new Test("사과"));
        set.add(new Test("사과"));

        System.out.println(set.size());
        System.out.println(set);
    }
}

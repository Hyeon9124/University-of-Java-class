package chap05;
import java.util.Objects;
public class Member { // 객체 지향 프로그래밍에서 주요 특징 중 하나는 캡슐화이다.
    // field
    // 클래스 멤버를 외부에서 조작할 수 없도록 은닉하려면 멤버 앞에 private으로 지정한다.
    private int id;
    private String name;
    private String password;
    private int age;

    /** Alt + Insert **/

    // method : camel case
    // set method는 return 값이 없다.

    // Getter and Setter : 클래스 내부에 은닉한 필드를 외부에서 사용할 수 있도록 접근자, 설정자를 제공해야 한다.
    // 자바는 객체 자신을 참조할 수 있도록 this 키워드를 제공한다.
    // this 는 생성자에 의해 생성된 객체 자신을 가리킨다.
    // this()를 사용할 때는 반드시 생성자의 첫 행에 위치해야한다. --> 오류 발생하기 때문
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // Constructor : return type이 없다.
    // Object가 생성될 때 필드를 초기화 하거나 Object 사용을 준비한다.
    // 일반적으로 공개되어야 하므로 public으로 선언되지만 아닐 수도 있다. private으로 설정할 수도 있음.
    public Member(int id, String name, String password, int age) {
        // parameter를 Reference
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
    }
    /*
      - Default Constructor -
      모든 클래스는 생성자를 하나 이상 꼭 가진다. 생성자를 선언하지 않으면 컴파일러가 자동으로 디폴트 생성자를 추가한다.
      디폴트 생성자는 매개변수도 없고 본체에서 실행할 내용도 없는 생성자이다.
     */
    public Member(){

    }
    // toString() 과 equals() and hashCode()는 chap11에서 설명
    // toString()
    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
    // equals() and hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return id == member.id && age == member.age && Objects.equals(name, member.name) && Objects.equals(password, member.password);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, password, age);
    }
}
/*
  생성자
  1. 생성자 이름은 클래스 이름과 같다.
  2. 생성자의 반환 타입은 없다.
  3. 생성자는 new 연산자와 함께 사용하며, 객체를 생성할 때 호출한다.
  4. 생성자로 오버로딩할 수 있다.
 */

/*
  immutable : 불변의, 변경할 수 없는..
  Immutable Class는 변경이 불가능한 클래스이며, 가변적이지 않는 클래스이다.
  래퍼런스 타입의 객체이기 때문에 heap 영역에 생성된다.
 */
/*
  mutable : 변할수 있는
  immutable 객체와 다르게 heap 영역에 생성된 객체를 변경할 수 있다.
 */
/*
  singleton : 객체의 인스턴스가 오직 1개만 생성되는 패턴을 의미한다.
  싱글톤의 장점은 다른 클래스 간에 데이터 공유가 쉽다.
 */
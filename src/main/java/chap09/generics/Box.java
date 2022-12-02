package chap09.generics;
public class Box<T> { // T는 타입, Generic Class
    // field
    private T t; // 필드는 private

    // Getter and Setter
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
}
/*
  class 클래스 이름<타입 매개변수> {
    필드;
    메서드;
  }

  제네릭 클래스 <적용할 타입> 변수 = new 제네릭 클래스<적용할 타입>();

  E : 원소(Element)
  K : 키(Key)
  N : 숫자(Number)
  T : 타입(Type)
  V : 값(Value)
 */
// <> : Angle Bracket
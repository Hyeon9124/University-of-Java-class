package chap09.generics;
public class Box<T> { // T는 타입, Generic Class
    // field
    private T t;

    // Getter and Setter
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
}
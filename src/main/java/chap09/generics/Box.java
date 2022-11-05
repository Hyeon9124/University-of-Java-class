package chap09.generics;

public class Box<T> { // T는 타입
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

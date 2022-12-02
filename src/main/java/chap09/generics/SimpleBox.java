package chap09.generics;
public class SimpleBox {
    // field
    private Object object; // 필드는 private

    // Getter and Setter
    public Object getObject() {
        return object;
    }
    public void setObject(Object object) {
        this.object = object;
    }
}
/*
        Class                   Interface
     Generic class            Generic interface
  Casting(명시적 형변환)     Promotion(자동 형변환)
 */

// <> : Angle Bracket
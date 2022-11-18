package midterm_exam_3;

class Telephone extends Phone{ // extends를 사용해 상속관계 선언
    protected final String time;

    public Telephone(String user, String time) {  // Constructor
        super(user); // 부모 클래스의 Constructor 호출
        this.time = time; // field 초기화
    }

    void autoAnswering(){
        System.out.println(user + "가 부재 중이다. " + time + " 전화 주세요.");
    }
}
package midterm_exam_3;

class Smartphone extends Telephone{ // extends를 사용해 상속관계 선언
    private final String game;

    public Smartphone(String user, String time, String game) {
        super(user, time); // 부모 클래스의 Constructor 호출
        this.game = game; // field 초기화
    }

    void playGame(){
        System.out.println(user + "가 " + game + " 게임을 하는 중이다.");
    }
}
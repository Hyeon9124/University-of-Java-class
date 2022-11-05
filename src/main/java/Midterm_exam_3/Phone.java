package Midterm_exam_3;

class Phone {
    protected String user;

    public Phone(String user) { // Constructor
        this.user = user; // field 초기화
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    void call(){
        System.out.println(user + "가 통화 중이다.");
    }
}
package Midterm_exam_3;

public class PhoneTest {
    public static void main(String[] args) {
        
        Phone[] phones = new Phone[]{new Phone("ict01"), new Telephone("ict02", "내일"),
                new Smartphone("ict03", "파란색", "StarCraft")};

        for(Phone result : phones){ // foreach를 사용해 출력
            if(result instanceof Smartphone){ // 부모 클래스가 Smartphone이면
                ((Smartphone) result).playGame();
            }
            else if(result instanceof Telephone){ // 부모 클래스가 Telephone이면
                ((Telephone) result).autoAnswering();
            }
            else{ // 위의 두 조건이 아니면
                result.call();
            }
        }
    }
}
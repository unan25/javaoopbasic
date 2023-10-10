package chap02_02encap.encap_code;

// 덧셈, 뺄셈, 곱셈, 나눗셈 중 뭔가를 수행하라는 명령에 대한 정보를 묶어서 저장중인 클래스
public class CalculateCommand {

    private CalculateType calculateType; // 이 필드에는 ADD, MINUS, MULTIPLY, DIVIDE 넷 중 하나만 대입 가능

    private int num1; // 이 필드에는 정수이기만 하면 숫자가 몇이건 범위 내에서 다 대입 가능
    private int num2;


    /*
    CalculateCommand 객체에 실질적인 연산에 필요한 모든 자료가 저장되므로
    연산에 필요한 정보를 생성하는 단계에서 검사까지 해버리면 됨
     */
    public CalculateCommand(CalculateType calculateType, int num1, int num2) {
       // 생성단계에서 검증에 실패했다면, Unchecked Exception 을 사용하는것이 더 좋음
        if(calculateType == null)
            throw new RuntimeException("CalculateType은 필수 값 입니다.");
        if(calculateType == CalculateType.DIVIDE && num2 == 0)
            throw new RuntimeException("0 으로 나눌 수 없습니다.");

        this.calculateType = calculateType;
        this.num1 = num1;
        this.num2 = num2;
    }

    // 기존 Getter들을 모두 노출시킬 필요가 없으므로
    // 그러나 어쨋든 연산 결과를 만들어서 돌려줘야 하기 때문에
    public int getCalculateResult() {
        CalculateType calculateType = this.calculateType;
        int num1 = this.num1;
        int num2 = this.num2;

        // 생성자에서 이미 유효성 검사가 완료되었고, setter가 없으므로 값이 변하지 않는다는것까지 보장되므로 바로 연산
        int result = calculateType.calculate(num1, num2);

        return result;
    }

//  기존 getter
//    public CalculateType getCalculateType(){ return calculateType; }
//    public int getNum1(){ return num1; }
//    public int getNum2(){ return num2; }

}

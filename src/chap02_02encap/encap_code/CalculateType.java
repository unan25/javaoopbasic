package chap02_02encap.encap_code;

import java.util.function.BiFunction;

public enum CalculateType {
    // 제어 자료와 실제로 제어되었을때 실행할 구문까지 함께 저장해놨음
    //  == 응집도가 높아짐 (관련된 로직끼리 하나의 파일에 잘 구성되어있음)

    ADD ((num1, num2) -> num1 + num2), // 자바 화살표 함수: 단순 변수나 자료만 실행문에 두면 리턴 자료로 간주함
    MINUS ((num1, num2) -> num1 - num2),
    MULTIPLY ((num1, num2) -> num1 * num2),
    DIVIDE ((num1, num2) -> num1 / num2);

    // 생성자
    // CalculateType에 어떤 enum자료를 대입하냐에 따라 맞춰서 해당 로직을 호출할 수 있음
    CalculateType(BiFunction<Integer, Integer, Integer> expression) {
        this.expression = expression;
    }

    // expression은 각 이늄 자료에 매칭된 함수이므로
    // 선언 자료형은 BiFunction<>
    // 각 ENUM 자료형에 몰려있는 함수의 형식에 대해서 멤버 변수로 표현
    private BiFunction<Integer, Integer, Integer> expression;

    // 멤버 메서드를 통해 calculate를 수행하는데 이 과정에서
    // 어떤 이늄타입(ADD, MINUS, MULTIPLY, DIVIDE)냐에 따라 실행되는게 다름.
    public int calculate(int num1, int num2) {
        // num1, num2 를 받아 특정 enum에 매칭된 람다 실핼
        return this.expression.apply(num1, num2);
    }
}
package chap01_02inheritance.overriding;

public class Child extends Parent {

    // 부모 쪽 메서드와 시그니쳐(메서드명, 리턴자료형, 파리미터의 종류 등)은 같으나 실행 구문이 달라짐
    @Override
    public void someMethod() {
        System.out.println("Child someMethod");
    }

    /* @Override 미사용 시
    - 메서드 시그니쳐 사용 여부 파악x
    - 유지보수 간에 컴파일 간에 체크가 되도록 하기 위해
     */
}

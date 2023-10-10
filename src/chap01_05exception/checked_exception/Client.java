package chap01_05exception.checked_exception;

public class Client {

    public void tryCatchCheckedExceptionMethod() {
        // checked exception의 경우 발생 구문이 호출되면 무조건 예외처리가 동반되어야 한다.
        try {
            throw new CheckedException();
        } catch (CheckedException e ){
            // 예외 처리 코드
            e.printStackTrace();
        }
    }

    // try ~ catch를 호출부에서 직접 사용하고 싶지 않다면, 이 메서드를 호출하는 지역에서 처리할 수 있도록
    // throw를 메서드 우측에 작성할 수 있다. 이러면 try ~ catch를 작성은 해야하지만 굳이 현재 클래스 내부에서 작성할 필요는 없다.
    public void throwsCheckedExceptionMethod() throws CheckedException {
        throw new CheckedException();
    }

}

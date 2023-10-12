package chap01_05exception.unchecked_exception;

public class UncheckedExceptionExampleMain {
    public static void main(String[] args) {
        Client client = new Client();

        // throws로 던져진 예외이지만 try~catch를 강요받지는 않음
        // try~catch를 사용하는 것도 역시 가능함
        try {
            client.throwsUncheckedExceptionMethod();
        } catch (UncheckedException e ){
            e.printStackTrace();
        }

        // throws 가 아닌 특정 메서드 내부에서 예외를 발생시키는데 예외처리를 해주지 않아도 무방
        client.tryCatchUncheckedExceptionMethod();
    }
}

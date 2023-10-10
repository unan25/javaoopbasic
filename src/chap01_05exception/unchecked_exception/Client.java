package chap01_05exception.unchecked_exception;

public class Client {

    public void tryCatchUncheckedExceptionMethod() {
        try {
            throw new UncheckedException();
        } catch (UncheckedException e ){
            e.printStackTrace();
        }
    }

    public void throwsUncheckedExceptionMethod() throws UncheckedException {
        throw new UncheckedException();
    }
}

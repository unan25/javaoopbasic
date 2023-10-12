package chap03_01lsp;

public class LspExampleMain {
    public static void main(String[] args) {
        Client client = new Client();

        Parent parent = new Parent();
        Child child = new Child();

        /*
         child로 바꾸게 된다면,
         클라이언트 측에서 음수를 매개변수로 넘겨주던 부분을 양수로 고쳐줘야만 정상 동작하게 되므로,
         결국 양쪽 모두를 고쳐야만 개선할 수 있음
         */
        client.someClientMethod(child);
        // 결과 : Exception in thread "main" java.lang.RuntimeException: 양수만 받을 수 있습니다. !!!!!!
    }
}

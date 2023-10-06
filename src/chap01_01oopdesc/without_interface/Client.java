package chap01_01oopdesc.without_interface;

public class Client {
    public void someMethod() {
        // 메시지 보내기 전, 사전에 서버 연결 등

        // 코드

        // 사전 작업 후 메시지 발송 코드
        RealMessageSender messageSender = new RealMessageSender();
        messageSender.send();
    }
}

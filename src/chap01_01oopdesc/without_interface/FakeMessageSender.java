package chap01_01oopdesc.without_interface;

public class FakeMessageSender {

    public void send() {
        // 실제로 발송하지 않고 명목상으로만 발송했다고 처리
        System.out.println("FakeMessageSender, 실제로는 메시지를 방송하지 않습니다.");
    }
}

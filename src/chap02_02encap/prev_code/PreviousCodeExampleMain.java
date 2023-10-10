package chap02_02encap.prev_code;

public class PreviousCodeExampleMain {
    public static void main(String[] args) {
        CalculateCommand calculateCommand = new CalculateCommand(
                CalculateType.MULTIPLY,
                100,
                5
        );

        Client client = new Client();

        int result = client.someMethod(calculateCommand);

        System.out.println(result);
    }
}

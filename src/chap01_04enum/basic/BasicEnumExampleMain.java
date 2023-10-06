package chap01_04enum.basic;

public class BasicEnumExampleMain {
    public static void main(String[] args) {
        CalculateCommand calculateCommand = new CalculateCommand(
                CalculateType.ADD, // Enum ADD 전달
                100,    // num1
                3   // num2
        );

        Client client = new Client();
        int result = client.someMethod(calculateCommand);

        System.out.println(result);
    }
}

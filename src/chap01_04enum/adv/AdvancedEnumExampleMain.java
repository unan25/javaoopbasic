package chap01_04enum.adv;

public class AdvancedEnumExampleMain {
    public static void main(String[] args) {
        CalculateCommand calculateCommand = new CalculateCommand(
                CalculateType.ADD,  // Enum 타입은 ADD
                10, // num1
                3 // num2
        );
        Client client = new Client();
        int result = client.someMethod(calculateCommand);

        System.out.println(result);
    } // main
}

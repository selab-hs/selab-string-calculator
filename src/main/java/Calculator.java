import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] values = Input.readInput(scanner);
        int result = Operator.calculate(values);
        Output.printResult(result);
    }
}
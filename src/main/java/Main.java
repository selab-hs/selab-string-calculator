import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        CalculateStack calculateStack = new CalculateStack();
        System.out.println(calculateStack.getStack(input));

    }
}

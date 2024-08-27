import java.util.Scanner;

public class Input {
    public static String[] readInput(Scanner scanner) {
        System.out.print("수식을 입력하세요: ");
        return scanner.nextLine().split(" ");
    }
}
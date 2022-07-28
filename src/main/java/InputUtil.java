import java.util.Scanner;

public class InputUtil {
    public String inputStream() {
        System.out.println("계산할 식을 입력해주세요!");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

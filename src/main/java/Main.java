import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("계산할 수식을 입력하세요 (예: 30 + 20 / 2 * 4):");
        String expression = scanner.nextLine();

        Validator validator = new Validator();
        if (validator.isValid(expression)) {
            Calculator calculator = new Calculator();
            try {
                double result = calculator.calculate(expression);
                System.out.println("결과: " + result);
            } catch (ArithmeticException e) {
                System.out.println("계산 중 오류가 발생했습니다: " + e.getMessage());
            }
        } else {
            System.out.println("잘못된 수식 형식입니다. 다시 입력해주세요.");
        }
    }
}

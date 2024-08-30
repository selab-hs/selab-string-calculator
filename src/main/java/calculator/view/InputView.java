package calculator.view;

import java.util.Scanner;

public class InputView {
    public String formulaInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("수식을 입력하세요 : ");
        return scanner.nextLine();
    }
}
package view;

import java.util.Scanner;

public class Input {
    private final Scanner scanner = new Scanner(System.in);
    private final String SEPARATOR = " ";

    public String[] Input() {
        printInputMessage();
        return split(getData());
    }

    private void printInputMessage() {
        System.out.print("식을 입력해주세요 : ");
    }

    private String getData() {
        return scanner.nextLine();
    }

    private String[] split(String formula) {
        return formula.split(SEPARATOR);
    }
}
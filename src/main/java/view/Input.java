package view;

import java.util.Scanner;

public class Input {
    private final Scanner SCANNER = new Scanner(System.in);
    private final String SEPERATOR = " ";

    public String[] Input(){
        printInputMessage();
        return split(getData());
    }
    private void printInputMessage(){
        System.out.print("식을 입력해주세요 : ");
    }

    private String getData(){
        return SCANNER.nextLine();
    }

    private String[] split(String formula){
        return formula.split(SEPERATOR);
    }
}
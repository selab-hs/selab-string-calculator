import java.util.Scanner;

public class Input {

    Number numbers = new Number();
    Operator operators = new Operator();

    public static String input() {
        System.out.print("입력값: ");
        return new Scanner(System.in).nextLine();
    }

    public String[] inputDataSplit() {
        return input().split(" ");
    }

    public void split(String[] str_arr) {

        for(int i = 0; i < str_arr.length; i++) {
            if (i % 2 == 0) {
               numbers.validateNumber(str_arr[i]);
            }
            else {
                operators.validateOperator(str_arr[i]);
            }
        }
    }

    public Number getNumbers() {
        return numbers;
    }

    public Operator getOperators() {
        return operators;
    }

}

import java.util.Scanner;

public class Input {

    public static String input() {
        System.out.print("입력값: ");
        return new Scanner(System.in).nextLine();
    }

    public String[] inputDataSplit() {
        String[] data_arr = input().split(" ");
        return data_arr;
    }

}

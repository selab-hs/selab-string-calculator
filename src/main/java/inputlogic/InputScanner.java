package inputlogic;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputScanner implements InputLogic{
    @Override
    public List<String> inputFormula() {
        Scanner sc = new Scanner(System.in);
        return Arrays.asList(sc.nextLine().split(" "));
    }
}

import java.util.List;

public class Output {

    public static String output(List<Integer> numList, List<String> opsList) {
        return "결과값: " + Calculator.calculate(numList, opsList);
    }

}

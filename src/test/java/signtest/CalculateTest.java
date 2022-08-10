package signtest;



import Calculator.Model.Formula;

import Calculator.View.ExpressError.SIGNError;
import org.junit.jupiter.api.Test;

import java.util.*;

public class CalculateTest {
    List<String> formula = Arrays.asList(
            "10",
            "+",
            "100"
    );

    private static Map<String, Sign> operatorMap = new HashMap<>();

    static {
        operatorMap.put("+", Sign.PLUS);
        operatorMap.put("-", Sign.MINUS);
        operatorMap.put("*", Sign.MULTIPLY);
        operatorMap.put("/", Sign.DIVIDE);
    }

    public double calculate(int a, String sign, int b) {
        return Optional.ofNullable(operatorMap.get(sign))
                .orElseThrow(() -> new IllegalArgumentException(SIGNError.extraAlert()))
                .calculate(a, b);
    }

    @Test
    public void calculateFormula() {
        int answer = Integer.parseInt(formula.get(0));
        for (int i = 1; i < formula.size(); i += 2) {
            answer = ((int) calculate(answer, formula.get(i), Integer.parseInt(formula.get(i + 1))));
        }
        System.out.println(answer);
    }
}

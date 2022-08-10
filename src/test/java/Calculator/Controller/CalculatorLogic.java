package Calculator.Controller;

import Calculator.Calculator;
import Calculator.Model.Answer;
import Calculator.Model.Formula;
import Calculator.View.ExpressError.SIGNError;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class CalculatorLogic {

    private static Map<String, Calculator.Model.SIGN> operatorMap = new HashMap<>();

    static {
        operatorMap.put("+", Calculator.Model.SIGN.PLUS);
        operatorMap.put("-", Calculator.Model.SIGN.MINUS);
        operatorMap.put("*", Calculator.Model.SIGN.MULTIPLY);
        operatorMap.put("/", Calculator.Model.SIGN.DIVIDE);
    }

    public static double calculate(int a, String sign, int b) {
        return Optional.ofNullable(operatorMap.get(sign))
                .orElseThrow(() -> new IllegalArgumentException(SIGNError.extraAlert()))
                .calculate(a, b);
    }


    public static void calculateFormula(List<String> formula) {
        int answer = Formula.getFormula(0);
        for (int i = 1; i < formula.size(); i += 2) {
            answer = ((int) calculate(answer, formula.get(i), Integer.parseInt(formula.get(i + 1))));
        }
        Answer.setAnswer(answer);
    }

}

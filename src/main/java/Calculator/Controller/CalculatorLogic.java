package Controller;

import Model.Answer;
import Model.Formula;
import View.ExpressError.SIGNError;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class CalculatorLogic {
    public class Calculator {
        private static Map<String, Model.SIGN> operatorMap = new HashMap<>();

        static {
            operatorMap.put("+", Model.SIGN.PLUS);
            operatorMap.put("-", Model.SIGN.MINUS);
            operatorMap.put("*", Model.SIGN.MULTIPLY);
            operatorMap.put("/", Model.SIGN.DIVIDE);
        }

        public static double calculate(int a, String sign, int b) {
            return Optional.ofNullable(operatorMap.get(sign))
                    .orElseThrow(() -> new IllegalArgumentException(SIGNError.extraAlert()))
                    .mapCalculate(a, b);
        }
    }

    public class CalculateLogic {
        public static void calculateFormula(List<String> formula) {
            int answer = Formula.getFormula(0);
            for (int i = 1; i < formula.size(); i += 2) {
                answer = ((int) Calculator.calculate(answer, formula.get(i),Integer.parseInt(formula.get(i+1))));
            }
            Answer.setAnswer(answer);
        }
    }
}

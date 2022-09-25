package service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiFunction;

public class CalculationsUsingOperator {
    private int answer;

    private enum SignAnalysisAndCalculation {
        PLUS("+", (num1, num2) -> num1 + num2),
        MINUS("-", (num1, num2) -> num1 - num2),
        MULTIPLY("*", (num1, num2) -> num1 * num2),
        DIVIDE("/", (num1, num2) -> num1 / num2);


        private String operator;
        private BiFunction<Integer, Integer, Integer> analyzeTwoNumberAndCalculate;

        SignAnalysisAndCalculation(String sign, BiFunction<Integer, Integer, Integer> analyzeTwoNumberAndCalculate) {
            this.operator = sign;
            this.analyzeTwoNumberAndCalculate = analyzeTwoNumberAndCalculate;
        }

        private int calculateByOperator(int num1, int num2) {
            return analyzeTwoNumberAndCalculate.apply(num1, num2);
        }
    }

    private static final Map<String, SignAnalysisAndCalculation> operatorMap = new HashMap<>();

    static {
        operatorMap.put("+", SignAnalysisAndCalculation.PLUS);
        operatorMap.put("-", SignAnalysisAndCalculation.MINUS);
        operatorMap.put("*", SignAnalysisAndCalculation.MULTIPLY);
        operatorMap.put("/", SignAnalysisAndCalculation.DIVIDE);
    }

    private int calculateSinglePart(int a, String sign, int b) {
        return Optional.ofNullable(operatorMap.get(sign))
                .orElseThrow(() -> new IllegalArgumentException("error"))
                .calculateByOperator(a, b);
    }

    public int calculateTheWhole(List<String> formula) {
        this.answer = Integer.parseInt(formula.get(0));
        for (int i = 1; i < formula.size(); i += 2) {
            this.answer = calculateSinglePart(this.answer, formula.get(i), Integer.parseInt(formula.get(i + 1)));
        }
        return this.answer;
    }

}

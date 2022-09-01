package calculatelogic;


import storage.SignAnalysisAndCalculation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class CalculationsUsingOperator implements CalculateLogic {

    private static final Map<String, SignAnalysisAndCalculation> operatorMap = new HashMap<>();

    static {
        operatorMap.put("+", SignAnalysisAndCalculation.PLUS);
        operatorMap.put("-", SignAnalysisAndCalculation.MINUS);
        operatorMap.put("*", SignAnalysisAndCalculation.MULTIPLY);
        operatorMap.put("/", SignAnalysisAndCalculation.DIVIDE);
    }

    public double calculateSinglePart(int a, String sign, int b) {
        return Optional.ofNullable(operatorMap.get(sign))
                .orElseThrow(() -> new IllegalArgumentException("error"))
                .calculateByOperator(a, b);
    }


    public int calculateTheWhole(List<String> formula) {
        int answer = Integer.parseInt(formula.get(0));
        for (int i = 1; i < formula.size(); i += 2) {
            answer = ((int) calculateSinglePart(answer, formula.get(i), Integer.parseInt(formula.get(i + 1))));
        }
        return answer;
    }


}

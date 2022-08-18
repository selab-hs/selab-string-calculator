package calculatelogic;


import storage.SignAnalysisAnsCalculation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class CalculationsUsingOperator implements CalculateLogic {

    private static Map<String, SignAnalysisAnsCalculation> operatorMap = new HashMap<>();

    static {
        operatorMap.put("+", SignAnalysisAnsCalculation.PLUS);
        operatorMap.put("-", SignAnalysisAnsCalculation.MINUS);
        operatorMap.put("*", SignAnalysisAnsCalculation.MULTIPLY);
        operatorMap.put("/", SignAnalysisAnsCalculation.DIVIDE);
    }
    int answer;

    public double calculateSinglePart(int a, String sign, int b) {
        return Optional.ofNullable(operatorMap.get(sign))
                .orElseThrow(() -> new IllegalArgumentException("error"))
                .calculateByOperator(a, b);
    }


    public int calculateTheWhole(List<String> formula) {
        this.answer = Integer.parseInt(formula.get(0));
        for (int i = 1; i < formula.size(); i += 2) {
            answer = ((int) calculateSinglePart(answer, formula.get(i), Integer.parseInt(formula.get(i + 1))));
        }
        return answer;
    }


}

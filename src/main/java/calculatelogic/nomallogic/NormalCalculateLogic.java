package calculatelogic.nomallogic;


import calculatelogic.CalculateLogic;
import storage.AnalyzeSignAndCalculate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class NormalCalculateLogic implements CalculateLogic {

    private static Map<String, AnalyzeSignAndCalculate> operatorMap = new HashMap<>();

    static {
        operatorMap.put("+", AnalyzeSignAndCalculate.PLUS);
        operatorMap.put("-", AnalyzeSignAndCalculate.MINUS);
        operatorMap.put("*", AnalyzeSignAndCalculate.MULTIPLY);
        operatorMap.put("/", AnalyzeSignAndCalculate.DIVIDE);
    }
    int answer;

    public double calculateSinglePart(int a, String sign, int b) {
        return Optional.ofNullable(operatorMap.get(sign))
                .orElseThrow(() -> new IllegalArgumentException("error"))
                .calculate(a, b);
    }


    public int calculateAll(List<String> formula) {
        this.answer = Integer.parseInt(formula.get(0));
        for (int i = 1; i < formula.size(); i += 2) {
            answer = ((int) calculateSinglePart(answer, formula.get(i), Integer.parseInt(formula.get(i + 1))));
        }
        return answer;
    }


}

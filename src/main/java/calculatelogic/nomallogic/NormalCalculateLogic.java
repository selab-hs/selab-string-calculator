package calculatelogic.nomallogic;


import calculatelogic.CalculateLogic;

import java.util.List;
import java.util.Optional;

public class NormalCalculateLogic implements CalculateLogic {
    OperatorMap operatorMap = new OperatorMap();

    public double calculateSinglePart(int a, String sign, int b) {
        return Optional.ofNullable(operatorMap.getOperatorMap().get(sign))
                .orElseThrow(() -> new IllegalArgumentException("error"))
                .calculate(a, b);
    }


    public void calculateAll(List<String> formula) {
        int answer = Integer.parseInt(formula.get(0));
        for (int i = 1; i < formula.size(); i += 2) {
            answer = ((int) calculateSinglePart(answer, formula.get(i), Integer.parseInt(formula.get(i + 1))));
        }
        System.out.println(answer);
    }
}

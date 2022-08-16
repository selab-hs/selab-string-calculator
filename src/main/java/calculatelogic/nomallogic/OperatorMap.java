package calculatelogic.nomallogic;

import storage.AnalyzeSignAndCalculateByOperator;

import java.util.HashMap;
import java.util.Map;

public class OperatorMap {
    private  Map<String, AnalyzeSignAndCalculateByOperator> operatorMap = new HashMap<>();

    OperatorMap(){
        operatorMap.put("+", AnalyzeSignAndCalculateByOperator.PLUS);
        operatorMap.put("-", AnalyzeSignAndCalculateByOperator.MINUS);
        operatorMap.put("*", AnalyzeSignAndCalculateByOperator.MULTIPLY);
        operatorMap.put("/", AnalyzeSignAndCalculateByOperator.DIVIDE);
    }

    public Map<String, AnalyzeSignAndCalculateByOperator> getOperatorMap() {
        return operatorMap;
    }
}

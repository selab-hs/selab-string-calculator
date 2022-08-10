package calculatelogic.nomallogic;

import storage.Sign;

import java.util.HashMap;
import java.util.Map;

public class OperatorMap {
    private  Map<String, Sign> operatorMap = new HashMap<>();

    OperatorMap(){
        operatorMap.put("+", Sign.PLUS);
        operatorMap.put("-", Sign.MINUS);
        operatorMap.put("*", Sign.MULTIPLY);
        operatorMap.put("/", Sign.DIVIDE);
    }

    public Map<String, Sign> getOperatorMap() {
        return operatorMap;
    }
}

package calculatelogic;

import calculatelogic.nomallogic.NormalCalculateLogic;

public class CalculateConfig {

    public CalculateLogic calculateLogic(){
        return logic();
    }

    private CalculateLogic logic(){
        return new NormalCalculateLogic();
    }
}

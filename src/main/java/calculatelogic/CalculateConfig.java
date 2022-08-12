package calculatelogic;

import calculatelogic.nomallogic.NormalCalculateLogic;

public class CalculateConfig {

    public CalculateLogic calculateLogic(){
        return new NormalCalculateLogic();
    }
}

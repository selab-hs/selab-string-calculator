package calculatelogic;

public class CalculateConfig {

    public CalculateLogic calculateLogic(){
        return logic();
    }

    private CalculateLogic logic(){
        return new CalculationsUsingOperator();
    }
}

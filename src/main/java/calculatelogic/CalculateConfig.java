package calculatelogic;

public class CalculateConfig {

    public static CalculateConfig calculateConfig = new CalculateConfig();


    public Calculation calculateLogic(){
        return new CalculationsUsingOperator();
    }


}

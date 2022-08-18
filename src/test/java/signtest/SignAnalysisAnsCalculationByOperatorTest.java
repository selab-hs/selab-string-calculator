package signtest;


import calculatelogic.CalculateConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class SignAnalysisAnsCalculationByOperatorTest {

    List<String> formula = Arrays.asList(
            "10",
            "+",
            "30"
    );

    @Test
    public void calculateTest(){
        CalculateConfig calculateConfig = new CalculateConfig();
        Assertions.assertEquals(calculateConfig.calculateLogic().calculateTheWhole(formula),40);
    }
}

package ValidateTest;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class NumberTest {

    @Test
    void numberTest(){
        List<String> formula = new ArrayList<>();
        formula.add("10");
        formula.add("$");
        formula.add("120");

         try{
            for(String number : formula){
                int intValue = Integer.parseInt(number);
            }
        }catch (Exception e){
            System.out.println("error");
        }
    }
}

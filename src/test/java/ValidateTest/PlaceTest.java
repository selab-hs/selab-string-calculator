package ValidateTest;

import org.junit.jupiter.api.Test;
import showconsole.PlaceError;
import showconsole.ShowConsole;

import java.util.ArrayList;
import java.util.List;

public class PlaceTest {


    String notNumber = "[0-9]+";
    String ValidateSign ="+/*-";

    @Test
    void testPlace(){
        List<String> formula = new ArrayList<>();
        formula.add("+");
        formula.add("20");
        formula.add("250");
        checkValidate(formula);
    }


    public void checkValidate(List<String> formula) {
        for (int i = 0; i < formula.size(); i++) {
            if(i %2 == 0) checkNumber(formula.get(i));
            else checkSign(formula.get(i));
        }
    }

    private void checkNumber(String number){
        System.out.println("checkNumber = " + number);
        if(!number.matches(notNumber)){
            System.out.println("noNumber");
        }
    }
    private void checkSign(String sign){
        System.out.println("checkSign = " + sign);
        if(sign.matches(notNumber)) {
            System.out.println("noSign");
        }
    }
}

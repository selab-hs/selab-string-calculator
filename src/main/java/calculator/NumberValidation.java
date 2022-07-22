package calculator;

import calculatorIO.validity;
import error.NumberError;

public class NumberValidation implements validity {

    @Override
    public void doValidation(String data) {
        try{
            Integer.parseInt(data);
        } catch(NumberFormatException e){
            new NumberError().printErrorMessage();
            System.exit(0);
        }
    }
}

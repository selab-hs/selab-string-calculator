package calculator;

import calculatorIO.validity;

public class NumberValidation implements validity {

    @Override
    public boolean doValidation(String data) {
        try{
            Integer.parseInt(data);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}

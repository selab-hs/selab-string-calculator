package Calculator.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputAndConversion {
    static public void UserInputFormula(String[] tearFormula){
        ConversionFormula.stringToList(tearFormula);
    }

    public static class ConversionFormula {
        static public void stringToList(String[] Formula) {
            List<String> combined = new ArrayList<>(Arrays.asList(Formula));
            Calculator.Model.Formula.setFormula(combined);
        }
    }
}

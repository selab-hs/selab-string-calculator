package validatelogic;

import java.util.List;

import java.util.ArrayList;


public class ValidateNumber implements ValidateLogic {

    ConsoleConfig consoleConfig = new ConsoleConfig();

    @Override
    public void checkValidate(List<String> formula) {

        List<String> extractedFormula = extractNumber(formula);

        canChange(extractedFormula);
        notStartZero(extractedFormula);

    }

    private List<String> extractNumber(List<String> formula) {
        List<String> extractedFormula = new ArrayList<>();

        for (int i = 0; i < formula.size(); i += 2) {
            extractedFormula.add(formula.get(i));
        }
        return extractedFormula;
    }

    private void canChange(List<String> formula){
        try{
            for(String number : formula){
                int intValue = Integer.parseInt(number);
            }
        }catch (Exception e){
            consoleConfig.numberLogic().showConsole();
            System.exit(0);
        }
    }

    private void notStartZero(List<String> formula){
        for(String number : formula){
            if(number.charAt(0) == '0' && !number.equals("0")){
                consoleConfig.numberLogic().showConsole();
                System.exit(0);
            }
        }
    }
}

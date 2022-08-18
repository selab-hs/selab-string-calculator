package validatelogic;

import java.util.List;


public class NumberValidation implements ValidationCheckLogic {

    ConsoleConfig consoleConfig = new ConsoleConfig();

    @Override
    public void checkValidate(List<String> numbers) {
        checkCanChange(numbers);
        checkNotStartZero(numbers);
    }


    private void checkCanChange(List<String> formula){
        try{
            for(String number : formula){
                int intValue = Integer.parseInt(number);
            }
        }catch (Exception e){
            consoleConfig.numberLogic().expressOnConsole();
            System.exit(0);
        }
    }

    private void checkNotStartZero(List<String> formula){
        for(String number : formula){
            if(number.charAt(0) == '0' && !number.equals("0")){
                consoleConfig.numberLogic().expressOnConsole();
                System.exit(0);
            }
        }
    }
}

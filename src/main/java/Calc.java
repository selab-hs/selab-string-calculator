public class Calc {
    public int Calc(CheckNumOperator checkNumOperator){
        int calcResult = checkNumOperator.inputNum[0];
        for(int i = 0 ; i < checkNumOperator.inputOperator.length ; i++){
            switch (checkNumOperator.inputOperator[i]) {
                case "+":
                    calcResult = calcResult + checkNumOperator.inputNum[i + 1];
                    break;
                case "-":
                    calcResult = calcResult - checkNumOperator.inputNum[i + 1];
                    break;
                case "*":
                    calcResult = calcResult * checkNumOperator.inputNum[i + 1];
                    break;
                case "/":
                    calcResult = calcResult / checkNumOperator.inputNum[i + 1];
                    break;
            }
        }
        return calcResult;
    }
}

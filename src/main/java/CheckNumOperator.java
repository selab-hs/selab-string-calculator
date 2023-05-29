public class CheckNumOperator {
    protected static String[] inputOperator = { };
    protected Number inputNum;
    protected int numCount = 0;
    protected int operatorCount = 0;
    int numIndex = 0;
    int operatorIndex = 0;
    public CheckNumOperator(String input) {
        countNumOperator(input);
        saveNumOperator(input);
    }

    public void saveNumOperator(String input){
        inputOperator = new String[operatorCount];
        int[] inputNumArray = new int[numCount];
        for (int i = 0; i < input.length(); i++) {
            String currentChar = String.valueOf(input.charAt(i));
            if (isNum(currentChar)) {
                int currentNum = Integer.parseInt(currentChar);
                // 숫자가 연속으로 나올 경우 하나의 피연산자로 간주
                while (i < input.length() - 1 && isNum(String.valueOf(input.charAt(i + 1)))) {
                    currentNum = currentNum * 10 + Integer.parseInt(String.valueOf(input.charAt(i + 1)));
                    i++;
                }
                inputNumArray[numIndex] = currentNum;
                numIndex++;
            } else if (isOperator(currentChar)) {
                inputOperator[operatorIndex] = currentChar;
                operatorIndex++;
            } else if (!currentChar.equals(" ")) {
                System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
                System.exit(0);
            }
        }
        inputNum = new Number(inputNumArray);
    }

    public void countNumOperator(String input){
        for (int i = 0; i < input.length(); i++) {
            String currentChar = String.valueOf(input.charAt(i));
            if (isNum(currentChar)) {
                numCount++;
                // 숫자가 연속으로 나올 경우 하나의 피연산자로 간주
                while (i < input.length() - 1 && isNum(String.valueOf(input.charAt(i + 1)))) {
                    i++;
                }
            } else if (isOperator(currentChar)) {
                operatorCount++;
            }
        }
    }

    protected boolean isNum(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    protected boolean isOperator(String str) {
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }

}
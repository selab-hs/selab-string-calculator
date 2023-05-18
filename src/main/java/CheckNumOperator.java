public class CheckNumOperator {
    protected String[] inputOperator = { };
    protected int[] inputNum = { };
    public CheckNumOperator(String input){
        // 연산자와 피연산자 개수 계산

        int numCount = 0;
        int operatorCount = 0;
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

        // 연산자와 피연산자를 저장할 배열 생성
        inputOperator = new String[operatorCount];
        inputNum = new int[numCount];

        // 연산자와 피연산자 저장
        int numIndex = 0;
        int operatorIndex = 0;
        for (int i = 0; i < input.length(); i++) {
            String currentChar = String.valueOf(input.charAt(i));
            if (isNum(currentChar)) {
                int currentNum = Integer.parseInt(currentChar);
                // 숫자가 연속으로 나올 경우 하나의 피연산자로 간주
                while (i < input.length() - 1 && isNum(String.valueOf(input.charAt(i + 1)))) {
                    currentNum = currentNum * 10 + Integer.parseInt(String.valueOf(input.charAt(i + 1)));
                    i++;
                }
                inputNum[numIndex] = currentNum;
                numIndex++;
            } else if (isOperator(currentChar)) {
                inputOperator[operatorIndex] = currentChar;
                operatorIndex++;
            } else if(!currentChar.equals(" ")){
                System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
                System.exit(0);
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

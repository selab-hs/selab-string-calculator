public class Calc {
    public static void calc(String[] inputOperator, int[] inputNum){
        int calcResult = inputNum[0];

        for(int i = 0 ; i < inputOperator.length ; i++){
            if(inputOperator[i].equals("+"))
                calcResult = calcResult + inputNum[i + 1];
            if(inputOperator[i].equals("-"))
                calcResult = calcResult - inputNum[i + 1];
            if(inputOperator[i].equals("*"))
                calcResult = calcResult * inputNum[i + 1];
            if(inputOperator[i].equals("/"))
                calcResult = calcResult / inputNum[i + 1];
        }
        System.out.println("결과값 : " + calcResult);
    }
}

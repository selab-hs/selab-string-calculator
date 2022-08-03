public class CalcutaterStart {
    public static void main(String[] args) {

        SplitString splitString = new SplitString();
        StringToInteger stringToInteger = new StringToInteger(splitString.queue);
        Calculation calculation = new Calculation(stringToInteger.queueInt, stringToInteger.queueString);

        splitString.getString();
        splitString.StringToInteger();
        stringToInteger.SplitStringInt();
        calculation.CalculateLine();

    }

}



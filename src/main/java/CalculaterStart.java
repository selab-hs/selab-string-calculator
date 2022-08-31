public class CalculaterStart {
    public static void main(String[] args) {

        NumberExtractor numberExtractor = new NumberExtractor();
        StringToInteger stringToInteger = new StringToInteger(numberExtractor.numberSubmit);
        Calculation calculation = new Calculation(stringToInteger.fillternumber, stringToInteger.fillterSpace);

        numberExtractor.getString();
        numberExtractor.stringToInteger();
        stringToInteger.splitStringInt();
        calculation.calculateLine();

    }

}



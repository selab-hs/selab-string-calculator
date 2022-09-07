public class CalculaterStart {
    public static void main(String[] args) {
        NumberExtractor numberExtractor = new NumberExtractor();
        StringSeparation stringSeparation = new StringSeparation(numberExtractor.numberSubmit);
        Calculation calculation = new Calculation(stringSeparation.numbers, stringSeparation.Spaces);
        numberExtractor.getString();
        numberExtractor.stringToInteger();
        stringSeparation.splitStringInt();
        System.out.println(calculation.calculate());
    }
}



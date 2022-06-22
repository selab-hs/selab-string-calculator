public class Main {
    public static void main(String[] args) {
        InputStrSplit input = new InputStrSplit();

        input.strSplit();
        input.opsNumSplit();

        System.out.println("결과값: " + Calculator.calculate(input.numArr, input.opsArr));
    }
}

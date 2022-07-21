public class Main {
    public static void main(String[] args) {
        String input = InputStream.inputStream();

        double result = Calculator.calculate(input);

        OutputStream.outputStream(result);
    }
}

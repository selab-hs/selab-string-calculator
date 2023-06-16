import java.util.regex.Pattern;

public class Number {
    int[] number = { };

    public Number(int[] number) {
        this.number = number;
    }

    public Number() {

    }

    public int[] getNumber() {
        return number;
    }

    protected static boolean isNum(String str) {
        try {
            return str.matches("^[0-9]+$");
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException : " + e.getMessage());
            System.exit(0);
        }
        return false;
    }
}
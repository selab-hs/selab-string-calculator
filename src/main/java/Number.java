import java.util.ArrayList;

public class Number {
    private ArrayList<Integer> number;

    public ArrayList<Integer> Number(){
        return number;
    }
    public Number(ArrayList<Integer> number) {
        this.number = number;
    }

    public ArrayList<Integer> getNumber() {
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

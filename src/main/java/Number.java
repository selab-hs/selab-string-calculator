public class Number {
    private double number;

    Number(String number) {
        this.number = Double.parseDouble(number);
    }

    public double getNumber() {
        return number;
    }
}

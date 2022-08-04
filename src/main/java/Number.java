public class Number {
    private double number;

    Number(String number) {
        this.number = isDouble(number);
    }

    public double isDouble(String number) {
        try {
            return Double.parseDouble(number);
        } catch (Exception e) {
            throw new NumberFormatException("숫자가 아닙니다.");
        }
    }

    public double getNumber() {
        return number;
    }
}

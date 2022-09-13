package calculator;

public class Number {
    private int number;

    public Number(String data) {
        numberValidation(data);
        setNumber(Integer.parseInt(data));
    }

    public void numberValidation(String data) {
        try {
            Integer.parseInt(data);
        } catch (Exception e) {
            System.out.println("잘못된 숫자를 입력하셨습니다.");
            System.exit(0);
        }
    }

    public int getNumber() {
        return this.number;
    }

    private void setNumber(int number) {
        this.number = number;
    }
}

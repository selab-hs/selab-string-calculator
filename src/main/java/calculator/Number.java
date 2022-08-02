package calculator;
public class Number {

    private final int number;

    public Number(String number){
        this.number = Integer.parseInt(number);
    }
    public int getNumber(){
        return this.number;
    }
}

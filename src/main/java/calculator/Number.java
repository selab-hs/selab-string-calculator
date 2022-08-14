package calculator;

public class Number {
    private int number;
    public Number(String data){
        setNumber(Integer.parseInt(data));
    }
    private void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return this.number;
    }

    public static boolean isNumber(String data){
        try{
            Integer.parseInt(data);
            return true;
        } catch(Exception e){
            return false;
        }
    }
}

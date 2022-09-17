package service;

public class Calculate {

    public static Calculate calculate = new Calculate();


    public Calculation calculateLogic(){
        return new CalculationsUsingOperator();
    }


}

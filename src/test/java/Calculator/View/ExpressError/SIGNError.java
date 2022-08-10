package Calculator.View.ExpressError;


public class SIGNError implements ExpressError {
    static public void errorAlert() {
        System.out.println("SIGN ERROR");
    }

    static public String extraAlert(){
        return "SIGN Error";
    }
}

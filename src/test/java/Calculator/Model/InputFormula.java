package Calculator.Model;

import Calculator.Controller.InputAndConversion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputFormula {
     public static void UserInput() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            InputAndConversion.UserInputFormula(br.readLine().split(" "));
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

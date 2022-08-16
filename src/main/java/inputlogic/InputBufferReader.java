package inputlogic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputBufferReader implements  InputLogic{
    List<String> formula = new ArrayList<>();
    @Override
    public List<String> inputFormula() {
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String str = bufferedReader.readLine();
            this.formula = Arrays.asList(str.split(" "));
            bufferedReader.close();
            return this.formula;
        }catch (IOException e){
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}

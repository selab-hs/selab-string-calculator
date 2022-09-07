import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExpressionInput {
    protected String data = "";

    public void getString() {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("put String : ");
        try {
            data = str.readLine();
            str.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

package view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputViewer {
    public String input() {
        System.out.println("[ System ] Input Number Please");
        try (
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))
        ) {
            String userInput = bufferedReader.readLine();
            bufferedReader.close();
            return userInput;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
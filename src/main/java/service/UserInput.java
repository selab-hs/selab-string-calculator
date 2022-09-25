package service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class UserInput {
    public List<String> input() {
        try (
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))
        ) {
            String str = bufferedReader.readLine();
            List<String> formula;
            formula = Arrays.asList(str.split(" "));
            bufferedReader.close();
            return formula;
        } catch (Exception e) {
            e.printStackTrace();
            return new LinkedList<>();
        }
    }
}

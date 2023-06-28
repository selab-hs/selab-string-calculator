package service;

import java.util.Arrays;
import java.util.List;

public class DivideService {

    public List<String> divideInput(String input) {

        return Arrays.asList(input.split(" "));
    }
}
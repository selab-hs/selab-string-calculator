package calculatelogic;

import validatelogic.ConsoleConfig;

import java.util.List;

public class CalculationUsingSwitch implements CalculateLogic {
    private ConsoleConfig consoleConfig = new ConsoleConfig();
    private int answer;

    @Override
    public int calculateTheWhole(List<String> formula) {
        this.answer = Integer.parseInt(formula.get(0));
        for (int i = 1; i < formula.size(); i += 2) {
            calculate(formula.get(i), Integer.parseInt(formula.get(i + 1)));
        }
        return this.answer;
    }

    private void calculate(String sign, int number) {
        switch (sign) {
            case "+" -> answer += number;
            case "-" -> answer -= number;
            case "/" -> answer /= number;
            case "*" -> answer *= number;
            default -> {
                consoleConfig.signLogic();
                System.exit(0);
            }
        }
    }
}

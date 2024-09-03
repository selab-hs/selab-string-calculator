public class Validator {
    public boolean isValid(String expression) {
        String[] tokens = expression.split(" ");

        if (tokens.length % 2 == 0) {
            return false;
        }

        if (!isNumeric(tokens[0])) {
            return false;
        }

        for (int i = 1; i < tokens.length; i += 2) {
            if (!isOperator(tokens[i]) || !isNumeric(tokens[i + 1])) {
                return false;
            }
        }

        return true;
    }

    private boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isOperator(String str) {
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }
}

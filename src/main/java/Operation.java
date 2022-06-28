public class Operation {
    public static int Operate(int sum, int num, String operator) {

            switch (operator) {
                case "+": return sum + num;
                case "-": return sum - num;
                case "*": return sum * num;
                case "/": return sum / num;
                default: throw new RuntimeException("잘못되었습니다.");
            }

    }
}

public class Calculator {

    public static int calculate(int[] nums, String[] ops) {
        int sum = nums[0];

        for(int i = 0; i < ops.length; i++) {

            switch (ops[i]) {
                case "+" -> sum += nums[i + 1];
                case "-" -> sum -= nums[i + 1];
                case "*" -> sum *= nums[i + 1];
                case "/" -> sum /= nums[i + 1];
            }

        }

        return sum;
    }

}

import java.util.List;

public class Calculator {

    //여기서 어떻게 더 나눠야 할지 모르겠음

    public static int calculate(List<Integer> nums, List<String> ops) {
        int sum = nums.get(0);

        for(int i = 0; i < ops.size(); i++) {

            switch (ops.get(i)) {
                case "+" -> sum += nums.get(i+1);
                case "-" -> sum -= nums.get(i+1);
                case "*" -> sum *= nums.get(i+1);
                case "/" -> sum /= nums.get(i+1);
            }
        }

        return sum;
    }

}

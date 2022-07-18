public class CalculateStack {
    public double getStack(String input) throws Exception {
        String[] arr = input.split(" ");
        double first = Double.parseDouble(arr[0]);

        for(int i=1;i<arr.length-1;i=i+2) {
            String sign = arr[i];
            double second = Double.parseDouble(arr[i+1]);

            if(!Operator.of(sign)) {
                throw new Exception("잘못된 연산자입니다!");
            }

            if(sign.equals("/") && second==0) {
                throw new Exception("0으로 나눌 수 없습니다!");
            }

            for(Operator operator : Operator.values()) {
                if(operator.getSign().equals(sign)) {
                    first = operator.getCalulable().calculate(first, second);
                    continue;
                }
            }
        }

        return first;
    }
}

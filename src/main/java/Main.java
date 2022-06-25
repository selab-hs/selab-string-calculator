import java.util.List;

public class Main {
    public static void main(String[] args) {

        //조금 더러운 것 같음

        InputStrSplit input = new InputStrSplit();
        OpsNumSplit opsNumSplit = new OpsNumSplit();

        String[] str = input.strSplit();
        opsNumSplit.opsNumSplit(str);

        List<String> opsList = opsNumSplit.getOpsList();
        List<Integer> numList = opsNumSplit.getNumList();

        System.out.println(Output.output(numList, opsList));
    }
}
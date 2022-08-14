package view;

public class Output {
    public Output(int result){
        printOutputMessage(result);
    }

    public void printOutputMessage(int result){
        System.out.print("\n계산 결과 : " + result);
    }
}

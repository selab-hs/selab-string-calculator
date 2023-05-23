import java.util.Scanner;

public class GetInputValue {
    public String getInputValue(){
        Scanner sc = new Scanner(System.in);
        System.out.print("계산 하려는 식 : ");
        return sc.nextLine();
    }

}
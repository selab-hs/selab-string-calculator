import java.util.LinkedList;
import java.util.Queue;

public class SplitString extends GetString{
    Queue<String> queue = new LinkedList<>();
    public void StringToInteger(){
        String NumSignNum[] = data.split(" ");


        for(String i : NumSignNum){
            queue.add(i);
        }

    }
}

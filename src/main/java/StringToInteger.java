import java.util.LinkedList;
import java.util.Queue;
import static java.lang.Integer.parseInt;

public class StringToInteger {
    public final String isNumber = "[0-9]+";
    StringToInteger(Queue queue){
        this.queue = queue;
    }

    Queue<String> queue;
    Queue<Integer> queueInt = new LinkedList<>();
    Queue<String> queueString = new LinkedList<>();

    public void SplitStringInt(){

        while(!queue.isEmpty()){
            if(queue.peek().matches(isNumber)){
                queueInt.add(parseInt(queue.poll()));
            }
                queueString.add(queue.poll());
        }
    }
}

import java.util.concurrent.ExecutionException;

public class RemHandler implements IMethodHandler {
    private static final StringQueue stringQueue = QueueSingleton.GetStringQueue();
    private RemHandler() {
    }
    public final String name = "rem";
    public static void Handle(String arg) {
        try{
            System.out.println(stringQueue.dequeue());
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("queue is empty");
        }
    }
}

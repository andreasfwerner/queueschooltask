interface IMethodHandler{
    public final String name = "";

    public static void Handle(String arg) {

    }
}

public class AddHandler implements IMethodHandler {
    private static final StringQueue stringQueue = QueueSingleton.GetStringQueue();
    private AddHandler(){
    }
    public final String name = "add";
    public static void Handle(String arg){
        stringQueue.enqueue(arg);
    }
}


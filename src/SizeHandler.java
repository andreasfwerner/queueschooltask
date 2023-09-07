public class SizeHandler implements IMethodHandler{
    private static final StringQueue stringQueue = QueueSingleton.GetStringQueue();
    private SizeHandler(){
    }
    public final String name = "size";
    public static void Handle(String arg) {
        System.out.println(stringQueue.getSize());
    }
}
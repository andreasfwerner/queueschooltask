public class QueueSingleton {
    private static StringQueue stringQueue;

    private QueueSingleton(){
    }

    public static StringQueue GetStringQueue(){
        if (stringQueue == null){
            stringQueue = new StringQueue();
        }
        return stringQueue;
    }
}

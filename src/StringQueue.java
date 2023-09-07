interface IStringQueue{
    public void enqueue(String userInput);
    public String dequeue() throws IndexOutOfBoundsException;
    public int getSize();
}

public class StringQueue implements IStringQueue{
    private String[] elements = new String[1];
    private int size = 0;
    public int getSize() {return size;}
    public void enqueue(String userInput){
        if (size == elements.length){
            this.grow();
        }

        elements[size] = userInput;
        ++size;
    }
    public String dequeue() throws IndexOutOfBoundsException {
        if (size == 0){
            throw new IndexOutOfBoundsException("Queue is empty");
        }

        String firstElement = elements[0];
        for(int i = 0; i < size-1; i++){
            elements[i] = elements[i+1];
            elements[i+1] = null;
        }
        --size;
        return firstElement;
    }
    private void grow(){

       String[] oldElements = this.elements;
       this.elements = new String[size*2];

        for(int i = 0; i < size; i++)
        {
            elements[i] = oldElements[i];
        }

    }

}

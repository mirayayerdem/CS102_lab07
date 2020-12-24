/**
 * A class to keep Node list
 * @author Miray Ayerdem
 * @date 22/12/2020
 */
public class SimpleQueue {

    //properties
    private SimpleLinkedList list;

    //constructor
    public SimpleQueue(){
        list = new SimpleLinkedList();
    }

    /**
     * a method to add new node to the tail of the list
     * @param data of the new node
     */
    public void enqueue(String data){
        list.addToTail(data);
    }

    /**
     * a method to remove the Node from the head of the list
     * @return the the data of the removed Node
     */
    public String dequeue(){
        return list.removeFromHead();
    }

    /**
     * a method to check he list is empty or not
     * @return true if the list is empty otherwise false
     */
    public boolean isEmpty(){
        return list.isEmpty();
    }


    public String toString(){
        return list.toString();
    }
}

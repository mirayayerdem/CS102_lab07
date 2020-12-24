/**
 * A class to keep Node list
 * @author Miray Ayerdem
 * @date 22/12/2020
 */
public class SimpleLinkedList {

    //properties
    private Node head;

    //constructor
    public SimpleLinkedList(){
        head = null;
    }

    /**
     * a method to add the new node to the tail of the list
     * @param data of the new node
     */
    public void addToTail(String data){
        Node temp = head;
        Node newNode = new Node();
        newNode.setData(data);
        if(temp == null)
            head = newNode;
        else{
            while (temp.getNext() != null)
                temp = temp.getNext();
            temp.setNext(newNode);
        }

    }

    /**
     * a method to remove the node from the head of the list
     * @return the data of the removed node
     */
    public String removeFromHead(){
        String tempData;
        if(isEmpty()){
            return null;
        }
        tempData = head.getData();
        head = head.getNext();
        return tempData;
    }
    public boolean isEmpty(){
        return head == null;
    }

    /**
     * a method to get the specific node
     * @param data to find the node
     * @return the node or null
     */
    public Node get(String data){
        Node temp = head;
        if(!isEmpty()) {
            while(temp.getNext() != null) {
                if (temp.getData().equals(data))
                    return temp;
                temp = temp.getNext();
            }
        }
        return null;
    }

    public String toString() {
        if (isEmpty()) {
            return null;
        }
        Node position;
        String str = "{ "  + head.getData();
        position = head;
        while (position.getNext() != null){
            str = str + ", " + position.getNext().getData() ;
            position = position.getNext();
        }
        str = str + " }";

        return str;
    }
}

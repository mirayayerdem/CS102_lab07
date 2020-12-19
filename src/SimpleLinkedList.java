public class SimpleLinkedList {

    private Node head;
    private Node tail;

    public SimpleLinkedList(){
        head = null;
        tail = null;
    }
    public void addToTail(String data){
        Node newNode = new Node();
        newNode.setData(data);
        if(head == null)
            head = newNode;
        else if(tail ==  null) {
            tail = newNode;
            head.setNext(newNode);
        }
        else{
            tail.setNext(newNode);
            tail = newNode;
        }

    }
    public String removeFromHead(){
        String tempData;
        if(isEmpty()){
            throw new IllegalStateException();
        }
        tempData = head.getData();
        head = head.getNext();
        return tempData;
    }
    public boolean isEmpty(){
        return head == null;
    }
    /*public Node get(String data){
        return "";
    }*/
    public String toString() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        Node position;
        String str = head.getData();
        position = head;
        if (tail != null){
            do {
                str = str + " " + position.getNext().getData();
                position = position.getNext();
            }
            while (position.getNext() != null);
    }
        return str;
    }
}

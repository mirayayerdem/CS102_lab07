public class Node {

    //properties
    private String data;
    private Node next;

    public Node(){
        data = null;
        next = null;
    }
    public String getData(){
        return data;
    }
    public Node getNext(){
        return next;
    }
    public void setData(String data){
        this.data = data;
    }
    public void setNext(Node next){
        this.next = next;
    }
}

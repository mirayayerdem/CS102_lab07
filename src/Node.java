/**
 * A class to create Nodes
 * @author Miray Ayerdem
 * @date 22/12/2020
 */
public class Node {

    //properties
    private String data;
    private Node next;

    //constructor
    public Node(){
        data = null;
        next = null;
    }

    //mutator and accessor methods
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

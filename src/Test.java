public class Test {
    public static void main(String[] args){
        SimpleLinkedList linkedList = new SimpleLinkedList();
        linkedList.addToTail("miray");
        linkedList.addToTail("selin");
        linkedList.addToTail("ezgi");
        linkedList.addToTail("enes");
        System.out.println(linkedList.toString());
        System.out.println(linkedList.removeFromHead());
        System.out.println(linkedList.toString());
        System.out.println(linkedList.removeFromHead());
    }
}

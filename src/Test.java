/**
 * A class to test SimpleLinkedList, SimpleStackWithQueues and SimleStackWithQueue Classes
 * @author Miray Ayerdem
 * @date 24/12/2020
 */
public class Test {

    public static void main(String[] args){
        //test for linked list
        System.out.println("Linked List Test");
        SimpleLinkedList linkedList = new SimpleLinkedList();
        linkedList.addToTail("mac");
        System.out.println(linkedList.toString());
        linkedList.addToTail("charlie");
        System.out.println(linkedList.toString());
        linkedList.addToTail("deandre");
        System.out.println(linkedList.toString());
        linkedList.addToTail("dennis");
        System.out.println(linkedList.toString());
        System.out.println(linkedList.removeFromHead());
        System.out.println(linkedList.toString());
        System.out.println(linkedList.removeFromHead());
        System.out.println(linkedList.toString());
        linkedList.addToTail("martin");
        System.out.println(linkedList.toString());

        System.out.println("********************");

        //test for queue
        System.out.println("Queue Test");
        SimpleQueue queue = new SimpleQueue();
        queue.enqueue("jerry");
        System.out.println(queue.toString());
        queue.enqueue("elaine");
        System.out.println(queue.toString());
        queue.enqueue("george");
        System.out.println(queue.toString());
        queue.enqueue("kramer");
        System.out.println(queue.toString());
        queue.enqueue("newman");
        System.out.println(queue.toString());
        System.out.println(queue.dequeue());
        System.out.println(queue.toString());
        System.out.println(queue.dequeue());
        System.out.println(queue.toString());
        System.out.println(queue.dequeue());
        System.out.println(queue.toString());


        System.out.println("********************");

        //test for stack
        System.out.println("Stack Test");
        SimpleStackWithQueue stack = new SimpleStackWithQueue();
        stack.push("michael");
        System.out.println(stack.toString());
        stack.push("pam");
        System.out.println(stack.toString());
        stack.push("schrute");
        System.out.println(stack.toString());
        stack.push("jim");
        System.out.println(stack.toString());
        stack.push("kevin");
        System.out.println(stack.toString());
        System.out.println(stack.pop());
        System.out.println(stack.toString());
        System.out.println(stack.pop());
        System.out.println(stack.toString());





    }
}

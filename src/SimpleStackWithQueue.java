/**
 * A class to create stacks
 * @author Miray Ayerdem
 * @date 22/12/2020
 */
public class SimpleStackWithQueue {

    SimpleQueue q1;
    SimpleQueue q2;

    public SimpleStackWithQueue() {
        q1 = new SimpleQueue();
        q2 = new SimpleQueue();
    }

    /**
     * method to add new node to the mead of the queue
     * @param data of the new node
     */
    public void push(String data) {
        SimpleQueue temp;
        q2.enqueue(data);
        while (!isEmpty()) {
            q2.enqueue(q1.dequeue());
        }
        temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public String toString() {
        return q1.toString();
    }

    /**
     * a method to remove the head node
     * @return
     */
    public String pop() {
        return q1.dequeue();

    }
}
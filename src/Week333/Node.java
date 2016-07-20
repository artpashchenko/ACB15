package Week333;

/**
 * Created by Артем on 05.06.2016.
 */
public class Node {

    Node next;
    Node previous;
    Object value;

    public Node(Object value) {
        this.next = next;
        this.previous = previous;
        this.value = value;
    }

    public Node(Node tail, int i) {
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}

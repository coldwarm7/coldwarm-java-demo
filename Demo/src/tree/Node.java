package tree;


/**
 * Create by coldwarm on 2018/9/19.
 */

public class Node {
    public Object value;
    public Node next;

    public Node(Object value, Node next) {
        super();
        this.value = value;
        this.next = next;
    }

    public Node(Object value){
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

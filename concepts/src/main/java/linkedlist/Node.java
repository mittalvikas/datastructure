package linkedlist;


import java.util.Objects;

public class Node<T> {

     T data;
     Node<T> next;

    public Node() {

    }
    public Node(T data) {
        this.data = data;
    }

    public Node(T data,Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;
        Node<?> node = (Node<?>) o;
        return getData().equals(node.getData()) &&
                Objects.equals(next, node.next);
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getData());
    }
}

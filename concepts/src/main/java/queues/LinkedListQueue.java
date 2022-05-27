package queues;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class LinkedListQueue {
    private Node front;
    private Node rear;



    public LinkedListQueue() {
        this.front = null;
        this.rear = null;

    }

    public void enqueue(int data){

        if(full()){
            System.out.println("Queue is full");
            return;
        }

        Node t =  new Node(data);
        if(front==null){ // insert first node

            front = rear = t;
        }else{

            rear.next = t;
            rear = t;
        }
    }

    public int dequeue(){

        if(empty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int data = front.data;
        front = front.next;
        return data;
     }

    public boolean empty(){
        return front == null;
    }

    public boolean full(){

        return new Node(-1) == null ? true : false; // heap is full
    }

    public void display(){
        StringBuilder sb = new StringBuilder();
        Node f = front;

        while(f!=null){
            sb.append(f.data).append("<-");
            f=f.next;
        }
        System.out.println("Queue: "+sb);
    }


    public static void main(String[] args) {
        LinkedListQueue q =  new LinkedListQueue();

        System.out.println("empty ? "+q.empty());
        System.out.println("full ? "+q.full());

        q.display();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        System.out.println("full ? "+q.full());
        q.display();
        System.out.println("Deque: "+q.dequeue());
        System.out.println("Deque: "+q.dequeue());
        q.display();
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(9);
        q.display();
        System.out.println("Deque: "+q.dequeue());
        System.out.println("Deque: "+q.dequeue());
        System.out.println("Deque: "+q.dequeue());
        System.out.println("Deque: "+q.dequeue());
        System.out.println("Deque: "+q.dequeue());
        System.out.println("empty ? "+q.empty());
        System.out.println("full ? "+q.full());
        q.display();

    }

}

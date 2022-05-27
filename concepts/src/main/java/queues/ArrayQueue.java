package queues;

public class ArrayQueue {
    private int[] data;
    private int size;
    private int front;
    private int rear;



    public ArrayQueue(int size) {
        this.size = size;
        this.front = 0;
        this.rear = 0;
        data = new int[size];
    }

    public void enqueue(int data){

        if(full()){
            System.out.println("Queue is full");
            return;
        }
        rear= (rear+1)%size;
        this.data[rear] = data;
    }

    public int dequeue(){

        if(empty()){
            System.out.println("Queue is empty");
            return -1;
        }
        front=(front+1)%size;
        int data = this.data[front];
        this.data[front]=-1; //clear data
        return data;


    }

    public boolean empty(){
        return front==rear ? true : false;
    }

    public boolean full(){
        if ((rear + 1) % size == front){
            return true;
        }
        return false;
    }

    public void display(){
        StringBuilder sb = new StringBuilder();
        int f = front+1;

        do {
            sb.append(data[f]).append("<-");
            f=(f+1)%size;
        }while(f!=(rear+1)%size);
        System.out.println("Queue: "+sb);
    }


    public static void main(String[] args) {
        ArrayQueue q =  new ArrayQueue(5);

        System.out.println("empty ? "+q.empty());
        System.out.println("full ? "+q.full());
        //q.display();

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

    }

}

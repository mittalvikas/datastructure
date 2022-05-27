package queues;

import java.util.Stack;

public class QueueUsingTwoStacks {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueUsingTwoStacks (){
         stack1 = new Stack();
         stack2 = new Stack();
    }

    public void enqueue(int data){

        stack1.push(data);
    }

    public int dequeue(){

        if(empty()){
            System.out.println("Queue is empty");
            return -1;
        }

        if(stack2.isEmpty()){
            while(!stack1.isEmpty()) stack2.push(stack1.pop());
        }
        return stack2.pop();


    }

    public boolean empty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public boolean full(){
        return false;
    }


    public static void main(String[] args) {

        QueueUsingTwoStacks q = new QueueUsingTwoStacks();

        q.enqueue(1);
        q.enqueue(2);

        q.enqueue(3);

        q.enqueue(4);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

        q.enqueue(8);
        q.enqueue(9);
        q.enqueue(10);
        System.out.println(q.dequeue());




    }



}

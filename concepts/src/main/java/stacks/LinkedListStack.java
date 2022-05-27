package stacks;

public class LinkedListStack {

    private Node top;

    public LinkedListStack() {
        top = null;
    }

    public void push(int x){

        Node t = new Node(x);

        if(empty()){
            top = t;
            return;
        }

        t.next = top;
        top = t;
    }

    public int pop(){
        if(empty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    public int peek(int index){
        if(!empty()) {
            Node p = top;
            for (int i=0;i<index-1 && p!=null;i++)
                p=p.next;
            if(p!=null)return p.data;

        }
            return -1;
    }


    public int top(){

        if(empty()) return -1;
        return top.data;

    }

    public boolean empty(){

        return (top == null);

    }



    public void print(){
        Node p = top;

        while(p != null){
            System.out.println("| "+ p.data+" |");
            p = p.next;
        }
    }


    public static void main(String[] args) {
        LinkedListStack st = new LinkedListStack();

        System.out.println("Pop: "+st.pop());
        System.out.println("Empty: "+st.empty());
        st.push(1);
        st.push(2);
        st.push(3);
        st.print();
        st.push(4);
        st.push(5);
        st.push(6);
        st.print();
        System.out.println("Pop: "+st.pop());
        st.print();
        System.out.println("peek 2: "+st.peek(2));

        System.out.println("Top: "+st.top());

        System.out.println("Empty: "+st.empty());


        st.print();

    }

}

class Node{

    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}

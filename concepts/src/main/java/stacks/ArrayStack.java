package stacks;


public class ArrayStack  {

    private int size;
    private int top;
    private int[] data;

    public ArrayStack(int size) {
        this.size = size;
        top = -1;
        data = new int[size];
    }

    public void push(int x){
        if(full()){
            System.out.println("Stack is full");
            return;
        }
        data[++top] = x;
    }

    public int pop(){
        if(empty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return data[top--];
    }

    public int peek(int index){
        if(top-index+1 <0){
            System.out.println("Invalid Index");
            return -1;
        }

        return data[top-index+1];
    }

    public int top(){

        if(empty()) return -1;
        return data[top];

    }

    public boolean empty(){

        return (top == -1);

    }

    public boolean full(){
        return (top == size-1);
    }

    public void print(){
        for (int i=top; i>=0 ;i--){
            System.out.println("| "+ data[i]+" |");
        }
    }


    public static void main(String[] args) {


        ArrayStack st = new ArrayStack(5);

        System.out.println("Pop: "+st.pop());
        System.out.println("Empty: "+st.empty());
        st.push(1);
        st.push(2);
        st.push(3);
        st.print();
        System.out.println("Full: "+st.full());
        st.push(4);
        st.push(5);
        st.push(6);
        st.print();
        System.out.println("Full: "+st.full());
        System.out.println("Pop: "+st.pop());
        st.print();
        System.out.println("peek 2: "+st.peek(2));

        System.out.println("Top: "+st.top());

        System.out.println("Empty: "+st.empty());

        System.out.println("Full: "+st.full());

        st.print();






    }
}

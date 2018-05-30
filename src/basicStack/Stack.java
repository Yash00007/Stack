package basicStack;

public class Stack {

    private int[] stack;
    int top = 0;
    Stack(){
        stack = new int[1000];

    }
    public void push(int i){
        if(top >= stack.length)
        {
            stack = new int[ stack.length * 2 ];
            System.arraycopy( stack,0,stack,0,stack.length);
        }
            stack[top++] = i++;
    }
    public int pop(){
        if(top < 1){
            System.out.println("Stack is empty");
            return 0;
        }
        System.out.println("\n\n\n\n\n\n\n");
        System.out.println("after pop");

        return stack[top--];
    }
    public int peek(){
        return stack[top];
    }
    public void printStack(){
        System.out.println("|STACK|");
        System.out.println("|-----|");

        for( int i = top-1; i >= 0;  i--)
        {
            System.out.println("|  "+ stack[i] +"  |");
            System.out.println("|-----|");
        }
    }
}

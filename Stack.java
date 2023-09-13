
public class Stack{

    private int[] stack;
    private int stackTop = -1;

    Stack(int stackSize){
        stack = new int[stackSize];
    }

    public void stackAdd(int element){
        if (!fullStack()){
            stackTop++;
            stack[stackTop] = element;
        }
    }

    public int stackPop(){
        if (!emptyStack()){
            int top = stack[stackTop];
        
            stack[stackTop] = 0;
            stackTop--;
        
            return top;
        }
        return 0;
    }

    public boolean emptyStack(){
        return stackTop < 0;
    }

    public boolean fullStack(){
        return stackTop + 1 == stack.length;
    }

    public int stackTop(){
        return stack[stackTop];
    }

    public void showStack(){
        for (int i = stackTop; i > -1 ; i--){
            System.out.println(stack[i]);
        }
    }
}
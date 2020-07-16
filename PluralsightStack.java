class BasicStack<X>{
    private X [] data;
    int stackPointer;

    public BasicStack(){
        data = (X[]) new Object[1000];
        stackPointer = 0;
    }
    public void push(X newItem){
        data[stackPointer++] = newItem;
    }

    public X pop(){
        if (stackPointer ==0){
            throw new IllegalStateException("No More Items On The Stack");
        }
        return data[--stackPointer];
    }
    public boolean contains(X item){
        for (int i = 0; i<stackPointer; i++){
            if (data[i].equals(item)) return true;
        }
        return false;
    }
    public X access(X item){
        for (int i = 0; i<stackPointer; i++){
            if (item.equals(pop())) return data[i];
        }
        throw new IllegalArgumentException("We did not find this item on the stack"+ item);
    }
    public int size(){
        return stackPointer;
    }
    
}

public class PluralsightStack { 
    public static void main(String[] args) 
    { 
        //     System.out.println("I am a Geek"); 
        // System.out.println("6 of hearts");
        BasicStack<String> stack = new BasicStack<String>();
        // System.out.println(stack.pop());
        stack.push("1 of hearts");
        stack.push("2 of hearts");
        stack.push("3 of hearts");
        stack.push("4 of hearts");
        stack.push("5 of hearts");
        stack.push("6 of hearts");
        System.out.println("-->" + stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.contains("6 of hearts"));
        System.out.println(stack.contains("2 of hearts"));
        System.out.println(stack.access("2 of hearts"));
        System.out.println(stack.access("1 of hearts"));
        System.out.println(stack.access("2 of hearts"));
    } 
}
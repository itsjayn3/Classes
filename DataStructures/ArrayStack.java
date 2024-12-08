package DataStructures;

public class ArrayStack<T> implements IArray{

    private static final int DefaultCapacity = 100; // final means the value assigned cannot be changed after

    private T[] elems; // the actual array
    private final int maxSize; // size cannot change
    private int currSize; // current size of the array
    private int top;

    // constructor for the maxSize
    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        this.elems = (T[]) new Object[maxSize]; // ask for help for this line 
        this.currSize = 0;
        this.top = -1;
        
    }


    public ArrayStack(){
        this(DefaultCapacity); // ask for help with this line 
    }

    // checking top elem
    public T peek(){
        if (isEmpty()){
            System.out.println("The stack is empty");
        }
        return elems[top];
    }

    // adding an elem

    public void push(T elem){
        if (currSize == maxSize){
            System.out.println("Stack Overflow");
        }else{
           elems[++top] =  elem; 
           currSize++;
        }
    }

    // remove an elem

    public T pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        } 
            T elem = elems[top];
            elems[top--] = null; // gets rid of the reference and then decrements var top
            currSize--;
            return elem;
        
    }

    // get the current size 

    public int size(){
        return currSize; 
    }

    // is the stack empty? 
    
    public boolean isEmpty(){
        return currSize == 0;
    }

    // print the stack 

    public void print(){

   
    if (isEmpty()) {
        System.out.println("Stack is empty");
        return;
    }
    System.out.println("Stack contains:");
    for (int i = top; i >= 0; i--) {
        System.out.println(elems[i]);
    } 
}
}


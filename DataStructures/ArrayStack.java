package DataStructures;

public class ArrayStack implements IStack {

    private static final int DefaultCapacity = 100; // final means the value assigned cannot be changed after

    private int[] elems; // the actual array
    private final int maxSize; // size cannot change
    private int currSize; // current size of the array
    private int top;

    // constructor for the maxSize
    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        this.elems = new int[maxSize]; // initialize the array with the given size
        this.currSize = 0;
        this.top = -1;
    }

    public ArrayStack() {
        this(DefaultCapacity); // use default capacity
    }

    // checking top elem
    @Override
    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            throw new IllegalStateException("Cannot peek: Stack is empty");
        }
        return elems[top];
    }

    // adding an elem
    @Override
    public void push(int elem) {
        if (currSize == maxSize) {
            System.out.println("Stack Overflow");
            throw new IllegalStateException("Cannot push: Stack is full");
        } else {
            elems[++top] = elem; // increment top and add the element
            currSize++;
        }
    }

    // remove an elem
    @Override
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            throw new IllegalStateException("Cannot pop: Stack is empty");
        }
        elems[top--] = 0; // gets rid of the reference and then decrements var top
        currSize--;
    }

    // get the current size
    @Override
    public int size() {
        return currSize;
    }

    // is the stack empty? 
    @Override
    public boolean isEmpty() {
        return currSize == 0;
    }

    // print the stack 
    @Override
    public void print() {
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

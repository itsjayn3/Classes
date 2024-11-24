package DataStructures;

public class StackLinkedList implements IStack {
    LinkedList list;

    public StackLinkedList(){
        list = new LinkedList();
    }



    @Override
    public void push(int value) {
        list.addFront(value);
    }

    @Override
    public void pop() {
    // first option: implement remove first within the linkedlist
        list.removeFirst();
    // Second option: Make a method in LinkedList that returns head
//        int top = list.getHead().data;
//        list.remove(top);
    }

    @Override
    public void print() {
        list.print();

    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public int peek() {
        return list.getHead().data;
    }

    @Override
    public boolean isEmpty() {
       return list.isEmpty();

    }
}

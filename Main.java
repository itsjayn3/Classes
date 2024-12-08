import DataStructures.LinkedListNode;
import DataStructures.LinkedList;
import DataStructures.StackLinkedList;
import com.sun.source.tree.InstanceOfTree;
import com.sun.source.tree.ReturnTree;
import DataStructures.ArrayStack;

import java.util.*;

public class Main {



    public static void main(String[]args){


        StackLinkedList sll = new StackLinkedList();

        sll.push(35);
        sll.push(134);
        sll.print();
        System.out.println();
        System.out.println(sll.peek());
        sll.pop();
        sll.print();
        System.out.println();


        ArrayStack<Integer> stack = new ArrayStack<>(5);

        stack.push(10); 
        stack.push(200);
        stack.push(14);
        stack.push(2005); 

        stack.print();

        stack.pop(); 

        stack.print();

System.out.println("Top element (peek): " + stack.peek()); 


System.out.println("Popping top element: " + stack.pop()); 
stack.print(); 


System.out.println("Pushing more elements onto the stack:");
stack.push(40);
stack.push(50);
stack.push(60); 
stack.print(); 


}





}







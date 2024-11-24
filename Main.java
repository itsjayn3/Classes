import DataStructures.LinkedListNode;
import DataStructures.LinkedList;
import DataStructures.StackLinkedList;
import com.sun.source.tree.InstanceOfTree;
import com.sun.source.tree.ReturnTree;

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




    }
}


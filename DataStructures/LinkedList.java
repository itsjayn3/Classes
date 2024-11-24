package DataStructures;

public class LinkedList {
    private LinkedListNode head;
    private LinkedListNode last;
    private int count;


    public LinkedList(){
        head = last = null;
        count = 0;
    }

    public void addFront(int newValue){
        LinkedListNode newNode = new LinkedListNode(newValue);
        if (isEmpty()){
            head = last = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
        count++;
    }

    public void addBack(int newValue){
        LinkedListNode newNode = new LinkedListNode(newValue);
        if (isEmpty()){
            head = last = newNode;
        }else {
            last.next = newNode;
            last = newNode;
        }
        count++;
    }

    public boolean contains(int key){
        boolean found = false;
        var temp = head;
        while(temp != null && !found){
            if (key == temp.data){
                found = true;
            }else{
                temp = temp.next;
            }

        }
        return found;
    }

    public void print(){
        var temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public boolean isEmpty(){
        return head == null;

    }

    public int size(){
        return count;
    }

    public boolean remove(int target){
        boolean isInTheList = contains(target);
        if(isInTheList){
          LinkedListNode curr = head;
          LinkedListNode prev = null;
          while(curr != null ){
              if(curr.data == target){
                  break;
              }else{
                  prev = curr;
                  curr = curr.next;
              }
          }
          if(prev == null){ // Target is found in head
              head = head.next;
          }else{
              prev.next = curr.next;
              if(curr == last){ // Target is found in last
                  last = prev;
              }
          }
          count--;
        }

        return isInTheList;
    }

    public void removeFirst(){
        if(!isEmpty()){
            head = head.next;
            count--;
        }
    }

    public LinkedListNode getHead(){
        return head;
    }
}

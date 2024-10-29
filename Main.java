import java.util.*;

public class Main {


    public static void main(String[]args){
        Rectangle r1 = new Rectangle(3,5);
        Rectangle r2 = new Rectangle(2.5,5.6);
        Rectangle r3 = new Rectangle(6.3,12);
        Rectangle r4 = new Rectangle(8.0,53);
        Rectangle r5 = new Rectangle(20,17);
        List<Rectangle> list = new ArrayList<Rectangle>();

        list.add(r1);
        list.add(r2);
        list.add(r3);
        list.add(r4);
        list.add(r5);
        for(int i = 0 ; i < list.size() ; i++){
            if(list.get(i).perimeter() < 50 ){
                list.remove(list.get(i));
            }
            
        }
        System.out.println(list.size());
        
        

    }



}

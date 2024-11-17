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

        Triangle t1 = new Triangle(4,20);
        Triangle t2 = new Triangle(34,2);
        Triangle t3 = new Triangle(17,5);
        Triangle t4 = new Triangle(36,11);
        Triangle t5 = new Triangle(4,9);
        List<Triangle> list1 = new ArrayList<>();

        list1.add(t1);
        list1.add(t2);
        list1.add(t3);
        list1.add(t4);
        list1.add(t5);

        for(int i = 0 ; i < list1.size() ; i++){
            if(list1.get(i).perimeterTri() < 50 ){
                list1.remove(list1.get(i));
            }

        }
        System.out.println(list1.size());

        

    }



}

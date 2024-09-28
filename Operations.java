import java.util.*;
public class Operations {
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        //add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        //add at index
        list.add(1,4);
        System.out.println(list);
        //get
        System.out.println(list.get(2));
        //set
        list.set(2,50);
        System.out.println(list);

        //remove
        list.remove(2);
        System.out.println(list);
        //size
        System.out.println(list.size());

        

    }

    
}

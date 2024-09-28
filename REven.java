import java.util.*;
public class REven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<>();
        //add
        list.add(10);
        list.add(5);
        list.add(30);
        list.add(7);
        sc.close();
        RemoveEven(list);
        System.out.println(list);


    }
    public static void RemoveEven(ArrayList<Integer>list){
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i)%2 == 0){
                list.remove(i);
            }
        }
    }
    
}

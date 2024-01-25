import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        // add() function is used to add elements inside the Arraylist
        list.add(4);
        list.add(5);
        list.add(99);
        list.add(123244445);
        System.out.println(list);
        
       
        
        int variable = list.get(2);
        System.out.println(variable);
       
        // Add Element in Between
        list.add(4,45);
        System.out.println(list);
       
     
        list.set(1,88);
        list.set(0,22);
        
        
        list.remove(2);
        System.out.println(list);
        
        //size() -gives the size of list.
        System.out.println(list.size());
        
        //Printing List Elements using for loop
        for(int i=0;i< list.size();i++)
        {
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
       
       
        Collections.sort(list);
        System.out.println(list);


    }
}

package GFG.Hashing;

import java.util.HashSet;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int arr1[]={2,2,3,4,5,6,7,8};
        int arr2[]={34,43,21,5,2,3,4};

        HashSet<Integer> hs=new HashSet<>();

        //Firstly insert array 2 inside hashset then compare with array1

        for(int i=0;i<arr2.length;i++)
        {
            hs.add(arr2[i]);
        }
        for(int i=0;i<arr1.length;i++)
        {
           if(hs.contains(arr1[i]))
               System.out.print(arr1[i] + " ");
        }
    }
}

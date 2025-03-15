package GFG.Arrays.ArraysExtra;

import java.util.HashSet;

public class FindtheDuplicateElementsInArray {
    public static void main(String[] args) {
        int arr[]={1,23,34,21,3,42,34,21,67,87,34,26};
        HashSet<Integer> arrset=new HashSet<>();

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                    arrset.add(arr[i]);
            }
        }
        System.out.println(arrset.toString());
    }
}

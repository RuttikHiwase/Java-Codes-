package GFG.Arrays;

import java.util.Scanner;

//Insert the element in Position Given
public class InsertElementAtPosition {
    public static void main(String[] args) {
        int x[]={10,20,30,40,50,0,0,0,0};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Element to Insert");
        int ele=sc.nextInt();
        System.out.println("Enter the Position ");
        int pos=sc.nextInt();
        int idx=pos-1;

        for(int i=x.length-2;i>=idx;i--)
        {
            x[i+1]=x[i];

        }
       x[idx]=ele;

        for(int i=0;i<x.length;i++)
        {
            System.out.print(x[i] +" ");
        }
    }
}

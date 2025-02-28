package LinkedList;

import java.util.Scanner;

public class SinglyLinearLinkedList {

   static class Node{
       private Node next;
       private int data;

       public Node(){
           next=null;
           data=0;
       }

       public Node(int val){
           next=null;
           data=val;
       }
    }

private Node head;
    public SinglyLinearLinkedList() {
       head=null;
    }

   //------------------------------------------------
   void display(){
       System.out.println("Elements in List Are : ");
       Node trav=head;
       while(trav !=null)
       {
           System.out.print(trav.data +" ");
           trav=trav.next;
       }
       System.out.println();
   }

//------------------------------------------------
    //AddFirst
    void addFirst(int val){
        Node nn=new Node(val);
        if(head == null)
        {
            head=nn;
        }
        else {
            Node trav=head;
            nn.next=head;
            head=nn;
        }
    }

//-------------------------------------------------
    //Add Last
    void addLast(int val){
        Node nn=new Node(val);
        if(head == null)
        {
            head=nn;
        }
        else{
            Node trav=head;
            while(trav != null){
                trav=trav.next;
            }
            trav.next=nn;
        }
    }

//-------------------------------------------------
    void addAtPosition(int val,int pos){
        Node nn=new Node(val);

    }



















    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SinglyLinearLinkedList ll=new SinglyLinearLinkedList();
       int choise,val,pos;
       do{
           System.out.println("\n0. Exit\n1. Display\n2. Add First\n3.  Add Last\n4. Add At Pos\n5. Del First\n6.  Del Last\n7. Del At Pos\n8. Del All\nEnter choice: ");
           choise= sc.nextInt();
           switch (choise){
               case 1: //display
                        ll.display();
                        break;
               case 2: //AddFirst
                   System.out.println("Enter the Element to Insert");
                   val=sc.nextInt();
                   ll.addFirst(val);
                   break;

               case 3:  //Add Last
                   System.out.println("Enter the Element to be Inserted in Last");
                   val=sc.nextInt();
              //     ll.addLast(val);
                   break;

               case 4://Add At Position
                   System.out.println("Enter the element to be inserted");
                   val=sc.nextInt();
                   System.out.println("Enter the Position to insert At");
                   pos=sc.nextInt();
              //     ll.addAtPos(val,pos);
                   break;

               case 5://Delete First
               // ll.delFirst();
                break;


               case 6://Delete Last
              // ll.delLast();
               break;

               case 8:
                 //  ll.delAll();
                   break;

           }
       }while(choise !=0);

    }
}

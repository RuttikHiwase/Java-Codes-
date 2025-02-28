package LinkedList;

import java.util.Scanner;

public class Practice {
      class Node{
            private Node next;
            private int data;

            public Node() {
                  this.next = null;
                  this.data=0;
            }
            public Node(int data){
                  this.data=data;
                  next=null;
            }

      }
      private Node head;

      public Practice(Node head) {
            this.head = null;
      }

      void display(){
            System.out.print("The Elements  of list are : ");
             Node trav=head;
             while(trav !=null)
             {
                   System.out.print(trav.data + " ");
                   trav=trav.next;
             }
            System.out.println();

      }


      public static void main(String[] args) {

      }
}

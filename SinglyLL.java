package Practice;

public class SinglyLL {
    class Node{
        private int data;
        private Node next;

        public Node(){
            data=0;
            next=null;
        }
        public Node(int data) {
            this.data = data;
            this.next=null;
        }
    }
    private Node head;

    public SinglyLL() {
        this.head = null;
    }


    public void display(){
        System.out.print("Elements in the list are : ");

    }

}

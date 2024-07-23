package Stack;

public class NewQueue {
    private  int front;
    private int rear;
    private  int  arr[];

    public NewQueue(int size){
        rear=-1;
        front=-1;
        arr=new int[size];
    }

    public void push(int data)
    {
        rear++;
        arr[rear]=data;
    }

    public void pop(){
        front++;
    }

    public int  peek(){
        return arr[front+1];
    }

}

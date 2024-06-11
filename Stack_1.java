//import java.util.*;
//public class Stack_1 {
//    // Implementation using stack.
//     static class Stack {
//        static ArrayLists list = new ArrayLists();
//
//        public static boolean isEmpty() {
//            return list.size() == 0;
//        }
//
//        //Push
//        public static void push(int data) {
//            list.add(data);
//
//        }
//
//        //Pop
//        public static int pop() {
//            if (isEmpty()) {
//                return -1;
//            }
//
//            int top = list.get(list.size()-1);
//            list.remove(list.size()-1);
//            return top;
//        }
//
//        public static int peek() {
//            if (isEmpty()) {
//                return -1;
//            }
//       return list.get(List.size()-1);
//
//        }
//    }
//    public static void main(String[] args) {
//        Stack s=new Stack();
//        s.push(27);
//        s.push(34);
//        s.push(12);
//        s.push(45);
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//
//    }
//}
////Stack Use Lifo(Last in first out)
////Push O(1)
////Pop O(1)
////Peek O(1) -->Peek Operation/Top Operation
//// if no element is present in Stack return -1.
////--------------------
////Implementation of Stack
////1.Array      2.Arraylist       3.Linkedlist

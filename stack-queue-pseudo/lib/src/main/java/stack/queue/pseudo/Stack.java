package stack.queue.pseudo;

import java.util.EmptyStackException;

public class Stack <T> {
    Node <T> top;

    public Stack() {
        this.top = null;
    }

    public void push(T Value) {
        Node<T> newNode = new Node<T>(Value);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top=newNode;
        }
    }

    public  T pop (){

        if (isEmpty()) {
            throw new EmptyStackException();
        }   else {
            T value =top.data; //to save the data
            top =top.next;
            return value;
        }
    }



    public T peek (){
        if (isEmpty()) {
            throw new EmptyStackException();}
        return top.data;


    }

    public boolean isEmpty() {
        return top == null;
    }

//    @Override
//    public String toString() {
//        StringBuilder SB = new StringBuilder();
//
//        Node<T> current = top;
//        while (current != null) {
//            SB.append("["+ current.data+"]");
//            if (current.next != null) {
//                SB.append(" -> ");
//            }
//            current = current.next;
//        }
//
//        return SB.toString();
//    }


    public class Node <T> {
        T data ;
        Node<T> next ;

        public Node(T data) {
            this.data = data;

        }
    }
}
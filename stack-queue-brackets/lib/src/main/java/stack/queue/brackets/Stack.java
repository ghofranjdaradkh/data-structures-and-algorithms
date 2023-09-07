package stack.queue.brackets;

import java.util.EmptyStackException;

public class Stack <T> {

    Node <T> top;

    public Stack() {
        this.top = null;
    }

    public void push (T value){
        Node newNode =new Node<T>(value);
        if (top==null)
        top=newNode;

        else {
            top=newNode;//to take value
            newNode.next=top;

    }}

      public T pop() {
            if (top == null)
                throw new EmptyStackException();
           else {
              T delValue = top.data;// to store value of thw top
              top=  top.next ;// move top to another node
                return delValue;

            }
        }
public T peek (){
        if(isEmpty())
            throw  new EmptyStackException();
        else
            return top.data;
}
public boolean isEmpty(){
        return top==null;
}

    class Node<T> {
        T data ;
        Node next ;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}

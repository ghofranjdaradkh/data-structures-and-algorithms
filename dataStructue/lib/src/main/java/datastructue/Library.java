package datastructue;

import datastructue.Queue.Queue;
import datastructue.Stack.Stack;

public class Library {
    public static void main(String[] args) {
      try{
          Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
          System.out.println( stack);
          System.out.println( "peek value ="+ stack.peek());
          System.out.println("pop value = "+ stack.pop());
          System.out.println(" after pop : "+stack);
          System.out.println(stack.isEmpty());
    }
    catch(RuntimeException e)

    {
        System.out.println("empty");
    }
        System.out.println("----------------------------------------");
try{
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println(queue);
    System.out.println( "peek value ="+ queue.peek());
    System.out.println( "dequeue value = "+queue.dequeue());
    System.out.println("after dequeue : "+queue);
    System.out.println(queue.isEmpty());
        } catch (RuntimeException e) {
            System.out.println("empty");
        }
    }
}

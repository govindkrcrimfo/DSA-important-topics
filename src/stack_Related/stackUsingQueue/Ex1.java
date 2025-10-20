package stack_Related.stackUsingQueue;

import java.util.LinkedList;
import java.util.Queue;

/*
 *  Stack implementation using Queue
 *   1.using two queue 
 *   2. using one queue
 */
class MyStack {
    private Queue<Integer> primaryQ;
    private Queue<Integer> tempQ;

    MyStack() {
        this.primaryQ = new LinkedList<>();
        this.tempQ = new LinkedList<>();
    }

    void push(int element) {
        tempQ.offer(element);
        while (!primaryQ.isEmpty()) {
            tempQ.offer(primaryQ.poll());
        }
        Queue<Integer> swapQ = new LinkedList<>();
        swapQ = primaryQ;
        primaryQ = tempQ;
        tempQ = swapQ;
    }

    int top() {
        if (primaryQ.isEmpty()) {
            System.out.println("Stack is empty ");
            return -1;
        }
        return primaryQ.peek();
    }

    int pop() {
        if (primaryQ.isEmpty()) {
            System.out.println("Stack is empty ");
            return -1;
        }
        int val = primaryQ.poll();
        return val;
    }

    int size() {
        return primaryQ.size();
    }

}

public class Ex1 {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(2);
        s.push(4);
        s.push(6);
        s.push(8);
        System.out.println("Size of stack " + s.size());
        System.out.println("top method called " + s.top());
        System.out.println("Pop method called " + s.pop());
        System.out.println("Pop method called " + s.pop());
        System.out.println("Size of stack " + s.size());
        System.out.println("Pop method called " + s.pop());
        System.out.println("Pop method called " + s.pop());
        System.out.println("Size of stack " + s.size());
        System.out.println("Pop method called " + s.pop());

    }

}

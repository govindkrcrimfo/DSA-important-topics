package stack_Related.stackUsingQueue;
/*
 * stack impl using Single queue
 */

import java.util.LinkedList;
import java.util.Queue;

class MyStack1 {
    private Queue<Integer> q;

    MyStack1() {
        this.q = new LinkedList<>();

    }

    void push(int element) {
        int l = q.size();
        q.offer(element);
        for (int i = 0; i < l; i++) {
            q.offer(q.poll());
        }
    }

    int top() {
        if (q.isEmpty()) {
            System.out.println("Stack is empty ");
            return -1;
        }
        return q.peek();
    }

    int pop() {
        if (q.isEmpty()) {
            System.out.println("Stack is empty ");
            return -1;
        }
        return q.poll();
    }

    int size() {
        return q.size();
    }

}

public class Ex2 {
    public static void main(String[] args) {
        MyStack1 s = new MyStack1();
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
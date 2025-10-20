package queueRelated.queueUsingStack;

import java.util.Stack;

/*
 * Queue implementation using Stack 
 * approach -1 
 */
class MyQ {
    Stack<Integer> s1;
    Stack<Integer> s2;

    MyQ() {
        this.s1 = new Stack<>();
        this.s2 = new Stack<>();
    }

    void offer(int element) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(element);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    int peek() {
        if (s1.empty()) {
            System.out.println("Queue is empty ");
            return -1;
        }
        return s1.peek();
    }

    int poll() {
        if (s1.empty()) {
            System.out.println("Queue is empty ");
            return -1;
        }
        return s1.pop();
    }

    int size() {
        return s1.size();
    }

}

public class Ex1 {
    public static void main(String[] args) {
        MyQ q = new MyQ();
        q.offer(2);
        q.offer(4);
        q.offer(6);
        q.offer(8);
        System.out.println("Size of queue is " + q.size());
        System.out.println("Peek method called " + q.peek());
        System.out.println("Poll method called " + q.poll());
        q.offer(10);
        System.out.println("Poll method called " + q.poll());
        System.out.println("Poll method called " + q.poll());
        System.out.println("Poll method called " + q.poll());
        System.out.println("Size of queue is " + q.size());
        System.out.println("Poll method called " + q.poll());
        System.out.println("Poll method called " + q.poll());

    }

}

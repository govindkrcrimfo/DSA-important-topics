package queueRelated.queueUsingStack;

import java.util.Stack;

/*
 * Queue implmentation using Stack 
 * approach -> 2nd 
 */
class MyQ1 {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    MyQ1() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    void offer(int element) {
        s1.push(element);
    }

    int peek() {
        if (s2.isEmpty() && s1.isEmpty()) {
            System.out.println("Queue is Empty ");
            return -1;
        }
        if (!s2.isEmpty()) {
            return s2.peek();
        } else {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    int poll() {
        if (s2.isEmpty() && s1.isEmpty()) {
            System.out.println("Queue is Empty ");
            return -1;
        }
        if (!s2.isEmpty()) {
            return s2.pop();
        } else {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    int size() {
        return s1.size() + s2.size();
    }

}

public class Ex2 {
    public static void main(String[] args) {
        MyQ1 q = new MyQ1();
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

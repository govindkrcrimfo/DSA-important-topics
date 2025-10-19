package queueRelated.queueUsingArrayList;

/*
 *  queue using arrayList 
 */

import java.util.ArrayList;

class myQueue {
    private ArrayList<Integer> l;

    myQueue() {
        l = new ArrayList<>();
    }

    void offer(int element) { // add element of queue
        l.add(element);
    }

    int poll() { // removes and return element from queue
        if (l.size() == 0) {
            System.out.println("Queue is Empty ");
            return -1;
        }
        int val = l.get(0);
        l.remove(0);
        return val;
    }

    int peek() { // return element from queue
        if (l.size() == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return l.get(0);
    }

    int size() {
        return l.size();
    }

}

public class Ex1 {
    public static void main(String[] args) {
        myQueue q = new myQueue();
        q.offer(1);
        q.offer(2);
        q.offer(21);
        q.offer(101);
        System.out.println("size of queue " + q.size());
        System.out.println("queue peek method is called " + q.peek());
        System.out.println("queue poll method is called " + q.poll());
        System.out.println("size of queue " + q.size());
        System.out.println("queue poll method is called " + q.poll());
        System.out.println("queue poll method is called " + q.poll());
        System.out.println("queue poll method is called " + q.poll());
        System.out.println("size of queue " + q.size());
        System.out.println("queue poll method is called " + q.poll());

    }
}

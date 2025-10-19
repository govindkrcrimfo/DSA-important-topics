package stack_Related.stackImpl;
/*
 *  stack implementation using Array list ( 2nd approach )
 *  stack of specific size = 5 
 */

import java.util.ArrayList;

class MyStack1 {
    private ArrayList<Integer> l;
    private int index = -1;

    MyStack1() {
        l = new ArrayList<>(5);
    }

    void push(int element) {
        index++;
        if (index > 4) {
            index--;
            System.out.println("Stack is full ");

        } else {
            l.add(index, element);
        }
    }

    int top() {
        if (index < 0) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return l.get(index);
    }

    int pop() {
        if (index < 0) {
            System.out.println("Stack is Empty");
            return -1;
        }
        int val = l.get(index);
        l.remove(index);
        index--;
        return val;
    }

    int size() {
        return index + 1;
    }

    ArrayList<Integer> getStack() {
        return l;
    }
}

public class Ex2 {
    public static void main(String[] args) {
        MyStack1 s = new MyStack1();
        s.push(1);
        s.push(12);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6); // stack full
        s.push(100); // stack full becoz array of defined of size 5

        ArrayList<Integer> stack = s.getStack();
        System.out.println("size of stack " + s.size());
        System.out.println("Stack vlaue ");
        stack.forEach(i -> System.out.print(i + " "));
        System.out.println();

        System.out.println("top operation " + s.top());
        System.out.println("pop operation " + s.pop());
        System.out.println("pop operation " + s.pop());
        System.out.println("pop operation " + s.pop());
        System.out.println("pop operation " + s.pop());
        System.out.println("pop operation " + s.pop());
        System.out.println("pop operation " + s.pop());
        System.out.println("size  of stack " + s.size());
        s.push(100);
        System.out.println("top operation " + s.top());
        System.out.println("size " + s.size());

    }
}

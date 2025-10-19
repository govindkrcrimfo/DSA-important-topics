package stack_Related.stackUsingArrayList;

import java.util.ArrayList;

/*
 * implements Stack using List 
 */
class MyStack {
    private ArrayList<Integer> l;

    MyStack() { // constructor
        l = new ArrayList<>();
    }

    public void push(int element) {
        this.l.add(element);
    }

    public int top() {
        if (l.size() == 0) {
            System.out.println("Stack is empty ");
            return -1;
        }
        return l.get(l.size() - 1);
    }

    public int pop() {
        if (l.size() == 0) {
            System.out.println("Stack is empty ");
            return -1;
        }
        int lastEle = l.get(l.size() - 1);
        l.remove(l.size() - 1);
        return lastEle;
    }

    public int size() {
        return l.size();
    }

    public ArrayList<Integer> getStack() {
        return this.l;
    }
}

public class Ex1 {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(1);
        s.push(12);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(32);
        s.push(10);
        ArrayList<Integer> stack = s.getStack();
        System.out.println("size  of stack " + s.size());
        stack.forEach(i -> System.out.println(i));

        System.out.println("top operation " + s.top());
        System.out.println("pop operation " + s.pop());
        System.out.println("pop operation " + s.pop());
        System.out.println("pop operation " + s.pop());
        System.out.println("size  of stack " + s.size());
        s.push(100);
        System.out.println("top operation " + s.top());
        System.out.println("size " + s.size());

    }

}

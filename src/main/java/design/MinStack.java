package design;

import java.util.PriorityQueue;
import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack = new Stack<>();
    private PriorityQueue<Integer> sortedVals = new PriorityQueue<>();
    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        stack.push(x);
        sortedVals.add(x);
    }

    public void pop() {
        int topVal = stack.pop();
        sortedVals.remove(topVal);
    }

    public int top() {
        return stack.lastElement();
    }

    public int getMin() {
        return sortedVals.element();
    }
}

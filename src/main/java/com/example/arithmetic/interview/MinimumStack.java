package com.example.arithmetic.interview;


import java.util.Stack;

/**
 * @author xutong
 */
public class MinimumStack {
    private Stack<Integer> mainStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    /**
     * 入栈
     * @param element
     */
    public void  push(int element){
        mainStack.push(element);
        if (minStack.isEmpty() ||element<= minStack.peek()){
            minStack.push(element);
        }
    }

    /**
     * 出栈
     * @return
     */
    public int pop(){
        if (mainStack.peek().equals(minStack.peek())){
            System.out.println("min==="+minStack.pop());
        }
        return mainStack.pop();
    }

    public int getMin() throws Exception {
        if (mainStack.isEmpty()){
            throw new Exception("stack is empty");
        }
        return minStack.peek();
    }

    public static void main(String[] args) throws Exception {
        MinimumStack minimumStack = new MinimumStack();
        minimumStack.push(3);
        minimumStack.push(9);
        minimumStack.push(7);
        minimumStack.push(8);
        minimumStack.push(8);
        minimumStack.push(1);
        minimumStack.push(1);
        minimumStack.push(2);
        minimumStack.push(2);
        System.out.println(minimumStack.getMin());
        System.out.println(minimumStack.pop());
        System.out.println(minimumStack.pop());
        System.out.println(minimumStack.pop());
        System.out.println(minimumStack.pop());
        System.out.println(minimumStack.pop());
        System.out.println(minimumStack.pop());
    }
}

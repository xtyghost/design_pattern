package com.example.geekbang1.day6;

import java.util.Stack;

/**
 * 逆波兰表达式求值
 * @author xutong
 */
public class Q6_150_1 {
    public static void main(String[] args) {
       String[]  tokens = new String[]{"2","1","+","3","*"};
        System.out.println(new Q6_150_1().evalRPN(tokens));
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        Integer right ;
        Integer left;
        for (int i = 0; i < tokens.length; i++) {
            switch (tokens[i]){
                case "+":
                     right = stack.pop();
                     left = stack.pop();
                    stack.push(left +right );
                    break;
                case "-":
                     right = stack.pop();
                     left = stack.pop();
                    stack.push(left -right);
                    break;
                case "*":
                     right = stack.pop();
                     left = stack.pop();
                    stack.push(left *right);
                    break;
                case "/":
                     right = stack.pop();
                     left = stack.pop();
                    stack.push(left /right);
                    break;
                default:
                    stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }
}

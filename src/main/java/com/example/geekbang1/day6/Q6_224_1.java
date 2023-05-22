package com.example.geekbang1.day6;

import com.example.design_pattern.design_pattern.mediator.Stock;
import com.google.common.collect.Lists;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author xutong
 */
public class Q6_224_1 {
    public static void main(String[] args) {
        System.out.println(new Q6_224_1().calculate("-2+ 1"));
    }
    public int calculate(String s) {
        Character[] operators = {'+', '-', '*', '/', '(', ')'};
        Set<Character> operatorsSet = Arrays.stream(operators).collect(Collectors.toSet());
        ArrayList<String> list = new ArrayList<>();
        int startIndex =0;
        for (int i = 0; i < s.length(); i++) {
            if (operatorsSet.contains(s.charAt(i))){
                String trim = s.substring(startIndex, i).trim();
                if (!"".equals(trim)){
                    list.add(trim);
                }
                list.add(s.charAt(i)+"");
                startIndex= i+1;
            }
        }
        if (startIndex!=s.length()){
            String trim = s.substring(startIndex).trim();
            if (!"".equals(trim)){
                list.add(trim);
            }
        }

        Stack<String > bracketStack = new Stack<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(")")){
                LinkedList<String> linkedList = getTokenWithoutBracket(bracketStack);
                bracketStack.push(calculateWithoutBracket(linkedList.toArray(new String[0]))+"");
            }else {
                bracketStack.push(list.get(i));
            }
        }
        LinkedList<String> linkedList = new LinkedList<>();
        while (!bracketStack.isEmpty()) {
            linkedList.addFirst(bracketStack.pop());
        }
        return calculateWithoutBracket(linkedList.toArray(new String[0]));
    }

    private LinkedList<String> getTokenWithoutBracket(Stack<String> bracketStack) {
        LinkedList<String> linkedList = new LinkedList<>();
        String pop = bracketStack.pop();
        while (!pop.equals("(")){
            linkedList.addFirst(pop);
            pop = bracketStack.pop();
        }
        return linkedList;
    }

    public int calculateWithoutBracket(String[]  tokens){
        String[] operators = {"+", "-", "*", "/"};
        List<String> operatorsList = Arrays.stream(operators).collect(Collectors.toList());

        Stack<Integer> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            int left,right;
            if (!operatorsList.contains(token)){
                stack1.push(Integer.parseInt(token));
            }else if (token.equals("*")){
                left= stack1.pop();
                right= Integer.parseInt(tokens[i+1]);
                stack1.push(left*right);
                i++;
            }else if (token.equals("/")){
                left= stack1.pop();
                right= Integer.parseInt(tokens[i+1]);
                stack1.push(left/right);
                i++;
            }else {
                stack2.push(token.charAt(0));
            }
        }
        int result =0;
        while (!stack2.isEmpty()) {
            Character operator = stack2.pop();
            Integer right = stack1.pop();
         result=  doCalculate(result,right,operator);
        }
        if (!stack1.isEmpty()) {
            result = result+stack1.pop();
        }
        return result;
    }

    public int doCalculate(int left ,int right, char operator){
        switch (operator){
            case '+':
                return left+right;
            case '-':
                return left-right;
            case '*':
                return left*right;
            case '/':
                return left/right;
            default:
                return 0;
        }
    }
}

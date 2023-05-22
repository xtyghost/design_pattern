package com.example.geekbang1.day2;


import java.util.HashMap;
import java.util.Stack;

/**
 * 有效的括号
 * @author xutong
 */
public class Q2_20_1 {
    public static void main(String[] args) {
        System.out.println(new Q2_20_1().isValid("()[}]{}"));
    }
    public boolean isValid(String s) {
        if (s.length()%2==1){
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        map.put('[',']');
        map.put('(',')');
        map.put('{','}');
        Stack<Character> left = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character character = map.get(s.charAt(i));
            if (character!=null){
                left.push(character);
                continue;
            }else {
                if (!left.isEmpty()&&left.pop().equals(s.charAt(i))){
                        continue;
                }
            }
            return false;
        }
        return left.isEmpty();
    }
}

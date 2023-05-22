package com.example.geekbang1.day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 括号生成
 * @author xutong
 */
public class Q15_22_1 {
    public static void main(String[] args) {
        System.out.println(new Q15_22_1().generateParenthesis(3));
    }
    List<String> ans = new ArrayList<>();
    int index = 0;
    LinkedList<Integer > left = new LinkedList<>();
    public List<String> generateParenthesis(int n) {

        this.index = 2*n;
         doGenerateParenthesis(0);
         return ans;
    }

    public void doGenerateParenthesis(int n) {
        if (n==this.index-1||left.size()==this.index/2){
            LinkedList<Integer > cloneLeft = new LinkedList<>(left);
            Integer first = cloneLeft.removeFirst();
            StringBuilder str = new StringBuilder("");
            for (int i = 0; i < this.index; i++) {
                if (i==first){
                    str.append("(");
                    if (!cloneLeft.isEmpty()){
                        first = cloneLeft.removeFirst();
                    }
                }else {
                    str.append(")");
                }
            }
            ans.add(str.toString());
            return;
        }
        left.addLast(n);
        doGenerateParenthesis(n+1);
        left.removeLast();
        if (left.size()*2<=n){
            return;
        }
        doGenerateParenthesis(n+1);
    }

}

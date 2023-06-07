package com.example.top100;

import com.alibaba.fastjson.JSONArray;
import com.example.geekbang1.day2.Q2_25_2;

public class Hot142 {
    public static void main(String[] args) {
        Hot142 hot142 = new Hot142();
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = listNode;
        System.out.println(JSONArray.toJSONString(hot142.detectCycle(listNode)));

    }

    public ListNode detectCycle(ListNode head) {
        ListNode oneStep = head;
        ListNode twoStep = head;
        boolean flag = true;
        while (twoStep != null) {
            oneStep = getOneStep(oneStep);
            if (twoStep.next == null) {
                return null;
            }
            if (flag) {
                twoStep = getTwoStep(twoStep);
            } else {
                twoStep = getOneStep(twoStep);
            }
            if (oneStep == twoStep) {
                if (!flag) {
                    return twoStep;
                }
                twoStep = head;
                if (twoStep ==oneStep){
                    return twoStep;
                }
                flag = false;
            }

        }

        return null;
    }

    private static ListNode getOneStep(ListNode oneStep) {
        oneStep = oneStep.next;
        return oneStep;
    }

    private static ListNode getTwoStep(ListNode twoStep) {
        twoStep = twoStep.next.next;
        return twoStep;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

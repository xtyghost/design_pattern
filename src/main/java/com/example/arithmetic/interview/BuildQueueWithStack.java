package com.example.arithmetic.interview;

import java.util.Stack;
import java.util.concurrent.TimeUnit;

/**
 * @author xutong
 */
public class BuildQueueWithStack {
    Stack stackA =   new Stack<>();
    Stack stackB =   new Stack<>();
    public synchronized Object dequeue(){
        if (stackB.isEmpty()){
            if (stackA.isEmpty()) {
                return null;
            }else {
                while (!stackA.isEmpty()) {
                    stackB.push(stackA.pop());
                }
            }
        }
        return stackB.pop();
    }
    public synchronized void enqueue(Object o){
        stackA.push(o);
    }

    public static void main(String[] args) throws InterruptedException {
        BuildQueueWithStack buildQueueWithStack = new BuildQueueWithStack();
        for (int i = 0; i < 10; i++) {
            buildQueueWithStack.enqueue(i);
        }
       while (true){
           System.out.println(buildQueueWithStack.dequeue());
           TimeUnit.SECONDS.sleep(1);
       }
    }
}

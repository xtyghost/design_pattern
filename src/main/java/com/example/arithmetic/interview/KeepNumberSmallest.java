package com.example.arithmetic.interview;

/**
 * 让整数在删除指定数量字符的情况下最小
 * @author xutong
 */
public class KeepNumberSmallest {
    public int remove(int number,int removeCount){
        for (int i = 0; i < removeCount; i++) {
            number =removeOne(number);
            System.out.println(number);
        }
        return number;
    }

    public int removeOne(int number){
        if (number <10){
            return 0;
        }
       String num = number+"";
        char[] chars = num.toCharArray();
        StringBuilder builder = new StringBuilder("0");
        boolean flag = true;
        for (int i = 0; i < chars.length-1; i++) {
            if (chars[i]>chars[i+1]&&flag){
                flag = false;
                continue;
            }
            builder.append(chars[i]);
        }
        if (!flag){
            builder.append(chars[chars.length-1]);
        }
        return Integer.parseInt(builder.toString());

    }

    public static void main(String[] args) {
        System.out.println(new KeepNumberSmallest().remove(923145312, 0));
    }
}

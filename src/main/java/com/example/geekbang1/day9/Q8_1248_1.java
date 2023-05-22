package com.example.geekbang1.day9;

/**
 * 统计[优美子数组]
 * @author xutong
 */
public class Q8_1248_1 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,4,6};int k = 3;
        System.out.println(new Q8_1248_1().numberOfSubarrays(nums,k));
    }
    public int numberOfSubarrays(int[] nums, int k) {
        int[] ints = new int[nums.length + 1];
        ints[0]=0;
        System.arraycopy(nums,0,ints,1,nums.length);
        int sum =0;
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            ints[i]= ints[i]%2+sum;
            sum=ints[i];
            if (sum<k){
                continue;
            }
            for (int j = 0; j < i; j++) {
                int sum1 = ints[i] - ints[j];
                if (sum1 ==k){
                    count++;
                }else if (sum1<k){
                    break;
                }
            }
        }
        return count;
    }
}

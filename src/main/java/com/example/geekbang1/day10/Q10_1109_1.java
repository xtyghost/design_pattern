package com.example.geekbang1.day10;

/**
 * 航班预订统计，差分
 * @author xutong
 */
public class Q10_1109_1 {
    public static void main(String[] args) {

    }
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ans = new int[n];
        for (int i = 0; i < bookings.length; i++) {
            ans[bookings[i][0]-1]=ans[bookings[i][0]-1]+bookings[i][2];
            int j = bookings[i][1];
            if (j<n){
                ans[j]=ans[j]-bookings[i][2];
            }
        }
        for (int i = 1; i < ans.length; i++) {
            ans[i]= ans[i]+ans[i-1];
        }
        return ans;
    }
}

package com.xf.company;

import java.util.Arrays;

/**
 * @Auther: XU
 * @Date: 2018/11/13 10:33
 * @Description:
 */
public class TwoSum {


    public static int[] twoSum(int[] a, int target){
        for (int i = 0;i<a.length;i++) {
            for (int j=i+1;j<a.length;j++) {
                if (a[i]+a[j]==target) {
                    return new int[]{a[i],a[j]};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
          int[] abc =  twoSum(new int[]{6,3,7,9,4,2}, 9);
        System.out.println(Arrays.toString(abc));
    }
}

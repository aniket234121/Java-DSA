package dsa.Arrays;

import java.util.Arrays;

public class RearrangeNegativeAfterPositive {
    public static int[] rearrangeArray(int[] nums) {
       int res[]=new int[nums.length];
       int pos=0,neg=1;
       for(int i=0;i<nums.length;i++){
           if(nums[i]>0)
           {
               res[pos]=nums[i];
               pos+=2;
           }
           else
           {
               res[neg]=nums[i];
               neg+=2;
           }
       }

       return res;
    }
    public static void main(String[] args) {
        int nums[]=new int[]{28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31};

        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
}

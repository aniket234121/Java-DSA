package dsa.Arrays;

import java.util.Arrays;

public class RotateArrayNplace {
     public static void rotate(int[] nums, int k) {
        int count = 0;
        int res[]=new int[nums.length];

        for(int i=nums.length-k;i<nums.length;i++)
        {
            res[count]=nums[i];
            count++;
        }
        for(int i=0;i<nums.length-k;i++)
        {
            res[count]=nums[i];
            count++;
        }
        count=0;
        k=k%nums.length;
        for(int i:res)
        {
            nums[count]=i;
            count++;
        }
    }

    public static void main(String[] args) {
        int []nums=new int[]{1,2,3,4,5,6,7};
        rotate(nums,3);
        System.out.println(Arrays.toString(nums));


    }
}

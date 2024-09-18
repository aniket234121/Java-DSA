package dsa.Arrays;

import java.util.Arrays;
//rotate to right.
public class RotateArrayNplace {

    //optimal approach
    public static void reverse(int[]nums,int i,int j){
        while(i<=j)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public static void rotate(int[] nums, int k) {

        k=k%nums.length;
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-k-1);
        reverse(nums,0,nums.length-1);


    }

    //simple brute force approach
//     public static void rotate(int[] nums, int k) {
//        int count = 0;
//        int res[]=new int[nums.length];
//
//        for(int i=nums.length-k;i<nums.length;i++)
//        {
//            res[count]=nums[i];
//            count++;
//        }
//        for(int i=0;i<nums.length-k;i++)
//        {
//            res[count]=nums[i];
//            count++;
//        }
//        count=0;
//        k=k%nums.length;
//        for(int i:res)
//        {
//            nums[count]=i;
//            count++;
//        }
//    }

    public static void main(String[] args) {
        int []nums=new int[]{1,2,3,4,5,6,7};
        rotate(nums,3);
        System.out.println(Arrays.toString(nums));


    }
}

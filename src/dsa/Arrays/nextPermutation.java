package dsa.Arrays;

//A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
//
//For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
//The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).
//
//        For example, the next permutation of arr = [1,2,3] is [1,3,2].
//Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
//While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
//Given an array of integers nums, find the next permutation of nums.
//
//The replacement must be in place and use only constant extra memory.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3]
//Output: [1,3,2]
//Example 2:
//
//Input: nums = [3,2,1]
//Output: [1,2,3]
//Example 3:
//
//Input: nums = [1,1,5]
//Output: [1,5,1]

import java.util.Arrays;

public class nextPermutation {
    class Solution {
        public void nextPermutation(int[] nums) {
            int ind1=-1;
            int ind2=-1;
            // step 1 find breaking point
            for(int i=nums.length-2;i>=0;i--){
                if(nums[i]<nums[i+1]){
                    ind1=i;
                    break;
                }
            }
            // if there is no breaking  point
            if(ind1==-1){
                reverse(nums,0);
            }

            else{
                // step 2 find next greater element and swap with ind2
                for(int i=nums.length-1;i>=0;i--){
                    if(nums[i]>nums[ind1]){
                        ind2=i;
                        break;
                    }
                }

                swap(nums,ind1,ind2);
                // step 3 reverse the rest right half
                reverse(nums,ind1+1);
            }
        }
        void swap(int[] nums,int i,int j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        void reverse(int[] nums,int start){
            int i=start;
            int j=nums.length-1;
            while(i<j){
                swap(nums,i,j);
                i++;
                j--;
            }
        }
    } public static int justGreater(int []nums,int start,int target){
        int max=Integer.MAX_VALUE;
        int index=-1;
        for(int i=start+1;i<nums.length;i++){
            if(nums[i]>target && nums[i]<max)
            {
                max=nums[i];
                index=i;
            }
        }
        return index;
    }
    public static int findMinimum(int[] nums,int start){
        int min=Integer.MAX_VALUE;
        int index=-1;
        for(int i=start;i<nums.length;i++){
            if(nums[i]<min)
            {
                min=nums[i];
                index=i;
            }
        }
        return index;
    }
    public static void swap(int []nums,int i,int j ){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void nextPermutation(int[] nums) {
        int pivot=0;
    for(int i=nums.length-2;i>=0;i--)
    {
        if(nums[i]<nums[i+1])
        {
            pivot=i;
            //find just greater than nums[i] and replace it
            int index=justGreater(nums,pivot,nums[i]);
            swap(nums,pivot,index);
            break;
        }
    }
    if(nums[pivot]>nums[pivot+1]){
        Arrays.sort(nums);
        return;
    }
    for(int i=pivot+1;i<nums.length;i++)
    {
        int index=findMinimum(nums,i);
        swap(nums,i,index);
    }
    }
    public static void main(String[] args) {
        int num[]=new int[]{3,2,1};
        nextPermutation(num);
        System.out.println(Arrays.toString(num));
    }
}

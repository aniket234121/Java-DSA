package dsa.Arrays;

import java.util.Arrays;
public class MissingNo {
    public static int missingNumber(int[] nums){
        int count[]=new int[nums.length+1];

        for(int i:nums)
        {
            count[i]++;
        }
        for(int i=0;i<count.length;i++)
        {
            if(count[i]==0)
            {
                return i;
            }
        }
        return 0;
    }
//    public static int missingNumber(int[] nums) {
//        Arrays.sort(nums);
//
//        if(nums.length==1)
//        {
//            if(nums[0]==0)
//            {
//                return 1;
//            }
//            else{
//                return 0;
//            }
//        }
//        else if(nums.length==0)
//        {
//            return 0;
//        }
//        int start=0;
//        int end=nums.length-1;
//        while(start<=end)
//        {
//            int mid=start+(end-start)/2;
//
//            if(mid>start && nums[mid]-nums[mid-1]!=1)
//            {
//                return nums[mid]-1;
//            }
//            else if(mid<end && nums[mid+1]-nums[mid]!=1)
//            {
//                return nums[mid]+1;
//            }
//            if(start<end && nums[start+1]-nums[start]!=1)
//            {
//                return nums[start]+1;
//            }
//            else if(end>start && nums[end]-nums[end-1]!=1){
//                return nums[end]-1;
//            }
//            else{
//                start++;
//                end--;
//            }
//
//
//        }
//        if(nums[0]==0)
//        {return nums.length;}
//        return 0;
//    }
    public static void main(String[] args) {
        int nums[] =new int[]{0};
        System.out.println(missingNumber(nums));
    }
}

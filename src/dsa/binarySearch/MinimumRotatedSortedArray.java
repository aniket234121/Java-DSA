package dsa.binarySearch;

public class MinimumRotatedSortedArray {

    public static int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(mid<end && nums[mid]>nums[mid+1])
            {
                return nums[mid+1];
            }
            else if(mid>start && nums[mid]<nums[mid-1])
            {
                return nums[mid];
            }
            if(nums[mid]>nums[start])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return nums[0];

    }
    public static void main(String[] args) {
        int nums[]=new int[]{5,6,7,1,2,3};
        System.out.println(findMin(nums));
    }
}

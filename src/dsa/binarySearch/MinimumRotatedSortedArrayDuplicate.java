package dsa.binarySearch;

public class MinimumRotatedSortedArrayDuplicate {
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
            if(start<end && nums[start]>nums[start+1])
            {
                return nums[start+1];
            }
            else if(end>start && nums[end]<nums[end-1])
            {
                return nums[end];
            }
            else
            {
                start++;
                end--;
            }
        }
        return nums[0];
    }
    public static void main(String[] args) {
        int nums[]=new int[]{2,2,2,0,1};
        System.out.println(findMin(nums));

    }
}

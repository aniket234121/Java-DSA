package dsa.binarySearch;

public class SingleElementInSortedArray {
    public static int singleNonDuplicate(int[] nums) {

        int start=0;
        int end=nums.length-1;
        if(nums.length==1)
        {
            return nums[0];
        }

        while(start<=end){
            int mid=start+(end-start)/2;

            if(mid>start && mid<end && nums[mid]<nums[mid+1]&&nums[mid]>nums[mid-1]){
                return nums[mid];
            }
            else if(start<end && nums[start]<nums[start+1]){
                return nums[start];
            }
            else if(start<end && nums[end]>nums[end-1]){
                return nums[end];
            }
            else {
                start+=2;
                end-=2;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[]=new int[]{0,1,1};
        System.out.println(singleNonDuplicate(nums));
    }
}

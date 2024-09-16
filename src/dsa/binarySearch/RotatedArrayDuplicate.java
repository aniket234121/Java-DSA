package dsa.binarySearch;

public class RotatedArrayDuplicate {

    public static int findPivot(int []nums){

        if(nums.length==1)
        {
            return 0;
        }

        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            else if(start<end && nums[start]>nums[start+1])
            {
                return start;
            }
            else if(end>start && nums[end]<nums[end-1])
            {
                return end-1;
            }
            else {
                start++;
                end--;
            }

        }


        return -1;
    }
    public static boolean binarySearch(int []nums, int target,int start,int end){

        while(start<=end){
            int mid=start+(end-start)/2;

            if(nums[mid]>target)
            {
                end=mid-1;
            }
            else if(nums[mid]<target)
            {
                start=mid+1;
            }
            else {
                return true;
            }

        }

        return false;
    }

    public static boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(pivot==-1)
        {
            return binarySearch(nums,target,0,nums.length-1);
        }
        else if(nums[pivot]==target){
            return true;
        }
        else {
            boolean hasTarget=false;
            if(binarySearch(nums,target,0,pivot-1))
            {
                hasTarget=true;
            }
            else if(binarySearch(nums,target,pivot+1,nums.length-1))
            {
                hasTarget=true;
            }
            return hasTarget;
        }
    }

    public static void main(String[] args) {

        int []nums=new int[]{2,5,6,0,0,1,2};
        System.out.println(search(nums,9));
    }
}

package dsa.binarySearch;

public class RotatedArray {

    public static int pivot(int []nums)
    {
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(mid>start && nums[mid]<nums[mid-1])
            {
                return mid-1;
            }
            if(mid<end && nums[mid]>nums[mid+1])
            {
                return mid;
            }
            if(nums[mid]<nums[start])
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }

        return -1;
    }
    public static int BinarySearch(int []nums,int target,int start,int end){
        while(start<=end)
        {
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
                return mid;
            }
        }
        return -1;
    }
    public static int search(int[] nums, int target) {
        int piv=pivot(nums);
        if(piv==-1)
        {
         return BinarySearch(nums,target,0,nums.length-1);
        }
        if(nums[piv]==target)
        {
            return piv;
        }

           int a= BinarySearch(nums,target,0,piv-1);
           int b= BinarySearch(nums,target,piv+1,nums.length-1);
           if(a==-1&&b==-1)
           {return -1;}
           else if(a==-1)
           {
               return b;
           }
           else {
               return a;
           }


    }
    public static void main(String[] args) {
        int []nums={1,0};
    System.out.println(search(nums,0));
    }
}

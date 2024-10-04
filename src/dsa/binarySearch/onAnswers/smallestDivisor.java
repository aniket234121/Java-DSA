package dsa.binarySearch.onAnswers;

public class smallestDivisor {
    public static int findMax(int[]nums)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(nums[i],max);
        }
        return max;
    }
    public static int findThreshold(int nums[],int val){
        int threshold=0;
        for(int i=0;i<nums.length;i++)
        {
            int data=(int)Math.ceil((double)nums[i]/(double)val);
            threshold+=data;
        }
        return threshold;
    }
    public  static int smallestDivisor(int[] nums, int threshold) {

        int low=1;
        int high=findMax(nums);

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int thres=findThreshold(nums,mid);
            if(thres<=threshold)
            {
                high=mid-1;
            }else {
                low=mid+1;
            }

        }
        return low;
    }

    public static void main(String[] args) {
        int nums[]=new int[]{44,22,33,11,1};
        System.out.println(smallestDivisor(nums,5));
    }
}

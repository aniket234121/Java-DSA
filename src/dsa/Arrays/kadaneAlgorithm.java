package dsa.Arrays;

public class kadaneAlgorithm {
    public static int maxSubArray(int[] nums) {
        long max=Long.MIN_VALUE;
        long sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];

            if(sum>max)
            {
                max=sum;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
         return (int)max;
    }

    public static void main(String[] args) {
        int [] nums=new int[]{2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}

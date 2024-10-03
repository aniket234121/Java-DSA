package dsa.Arrays;

public class MaxSubArraySum {

    public static int subarraySum(int[] nums, int k) {

        int count=0;

        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            for(int j=i;j<nums.length;j++) {

                sum+=nums[j];
                if (sum == k) {
                    count++;
                }

            }
        }

        return count;
    }

    public static void main(String[] args) {
        int nums[]=new int[]{1,2,3};
        System.out.println(subarraySum(nums,3));
    }
}

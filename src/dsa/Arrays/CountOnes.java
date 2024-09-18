package dsa.Arrays;

public class CountOnes {
    //brute force O(n)
    public static  int findMaxConsecutiveOnes(int[] nums) {

        int max=0;
        int count=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]==1)
            {
                count++;
            }else{
                count=0;
            }
            if(max<count)
            {
                max=count;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[]=new int[]{1,1,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}

package dsa.Arrays;

public class MaxProduct {
    public static int maxProduct(int[] nums) {
        int maxPro=Integer.MIN_VALUE;
        if(nums.length==1)
        {
            return nums[0];
        }

        for(int i=0;i<nums.length;i++)
        {
            int product=1;
            for(int j=i;j<nums.length;j++) {
               product=product*nums[j];
               if(product>maxPro)
               {
                   maxPro=product;
               }
            }

        }

        return maxPro;
    }
    public static void main(String[] args) {
        int []nums=new int[]{0,2};
        System.out.println(maxProduct(nums));
    }
}

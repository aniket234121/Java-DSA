package dsa.Arrays;

import java.util.Arrays;

public class MoveZeroLast {
    public static void moveZeroes(int[] nums) {

        int i=0;
        for(int j=1;j<nums.length;j++)
        {
            if(nums[i]==0 && nums[j]!=0)
            {
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }
            else if(nums[i]==0 && nums[j]==0){}
            else{
            i++;
            }
        }
    }

    public static void main(String[] args) {
        int nums[]=new int[]{1,2,3,4,5,9};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}

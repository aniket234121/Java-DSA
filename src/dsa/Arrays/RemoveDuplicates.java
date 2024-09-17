package dsa.Arrays;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {

        int i=0;
        for(int j=1;j<nums.length;j++)
        {
            if(nums[i]!=nums[j])
            {
                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int []nums=new int[]{1,1,2};

        int k=removeDuplicates(nums);
        for(int i=0;i<k;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}

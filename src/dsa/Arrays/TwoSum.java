package dsa.Arrays;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int i=0;
        boolean found=false;
        int j=nums.length-1;
        int copy[]=new int[nums.length];
        int res[]=new int[2];
        for(int k:nums)
        {
            copy[i]=k;
            i++;
        }
        i=0;
        Arrays.sort(nums);
        while(i<j)
        {
            if((nums[i]+nums[j])==target)
            {
                found=true;
                i=nums[i];
                j=nums[j];
                break;
            }
            else if((nums[i]+nums[j])>target)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        if(found)
        {
            for(int k=0;k<copy.length;k++)
            {
                if(copy[k]==i)
                {res[0]=k;
                    break;}
            }
            for(int k=0;k<copy.length;k++)
            {
                if(copy[k]==j && k!=res[0])
                {res[1]=k;
                    break;}
            }

        }



        return res;
    }
    public static void main(String []args){
        int nums[]=new int[]{2,5,5,11};
        int target=10;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
}

package dsa.binarySearch;

import java.util.Arrays;

public class SneakyNo {
    public static int [] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int []count=new int[nums[nums.length-1]+1];

        for(int i=0;i<nums.length;i++)
        {
            count[nums[i]]++;
        }
        System.out.println(Arrays.toString(count));

        int []res={-1,-1};
        int pos=0;
        for(int i=0;i<count.length;i++)
        {
            if(count[i]==2)
            {
                res[pos]=i;
                pos++;
            }
        }
        return res;
    }
    public static void main(String [] args)
    {
        int []arr={0,3,2,1,3,2};
        System.out.println(Arrays.toString(getSneakyNumbers(arr)));

    }
}

package dsa.Arrays;
import java.util.*;
public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> lists=new ArrayList<>();
        Arrays.sort(nums);
        for(int l=0;l<nums.length;l++)
        {
            if(l>0 && nums[l]==nums[l-1]) continue;
            for(int i=l+1; i<nums.length; i++) {
                if(i>l+1 && nums[i]==nums[i-1]) continue;
                int j=i+1;
                int k = nums.length-1;

                while(j<k) {
                    long sum=nums[l];
                    sum+=nums[i];
                    sum+=nums[j];
                    sum+=nums[k];
                    List<Integer> list = new ArrayList<>();
                    if(sum==target) {
                        list.add(nums[l]);
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        lists.add(list);
                        j++;
                        k--;
                        while(j<k && nums[j]==nums[j-1])j++;
                        while(j<k && nums[k]==nums[k+1])k--;
                    }
                    else if(sum<target) {
                        j++;
                    }
                    else{
                        k--;
                    }
                }

            }

        }
        return lists;
    }
    public static void main(String[] args) {

        int nums[] = new int[]{2,2,2,2,2};
        System.out.println(fourSum(nums,8));

    }
}

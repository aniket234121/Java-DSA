package dsa.Arrays;

import java.util.*;
public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1;
            int val=-nums[i];
            int k = nums.length-1;

            while(j<k) {
                List<Integer> list = new ArrayList<>();
                if(nums[j]+nums[k]==val) {
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    lists.add(list);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1])j++;
                    while(j<k && nums[k]==nums[k+1])k--;
                }
                else if(nums[j]+nums[k]<val) {
                    j++;
                }
                else{
                    k--;
                }
            }

        }
        return lists;
    }
    public static void main(String[] args) {

        int nums[] = new int[]{0,0,0,0};
        System.out.println(threeSum(nums));

    }
}

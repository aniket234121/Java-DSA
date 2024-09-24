package dsa.Arrays;

import java.util.*;

public class MajorityElement2 {
//    public static List<Integer> majorityElement(int[] nums) {
//
//        List<Integer> li=new ArrayList<>();
//
//        int max=Integer.MIN_VALUE;
//        for(int i:nums)
//        {
//            max=Math.max(max,i);
//        }
//        int []hash=new int[max+1];
//        for(int i=0;i<nums.length;i++)
//        {
//            hash[nums[i]]++;
//        }
//        for(int i=0;i<hash.length;i++)
//        {
//            if(hash[i]>(nums.length/3))
//            {
//                li.add(i);
//            }
//        }
//
//        return li;
//    }
    public static List<Integer> majorityElement(int[] nums) {
    List<Integer> res=new ArrayList<>();
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<nums.length;i++)
    {
        if(!map.containsKey(nums[i]))
        {
            map.put(nums[i],1);
        }
        else {
            map.put(nums[i],map.get(nums[i])+1);
        }
    }
    for(Map.Entry<Integer,Integer> mapel:map.entrySet())
    {
        if(mapel.getValue()>nums.length/3)
        {
            res.add(mapel.getKey());
        }
    }
    return res;
    }
    public static void main(String[] args) {

        int nums[]=new int[]{1,-1,2,-2,-2};
        System.out.println(majorityElement(nums));
    }
}

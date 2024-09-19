package dsa.Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums){
        if(nums.length==0)
        {
            return -1;
        }

        int count=0;
        int element=0;
        for(int i=0;i<nums.length;i++){
           if(count==0)
           {
               count++;
               element=nums[i];
           }
           else if(element==nums[i])
           {
               count++;
           }
           else {
               count--;
           }
        }

        return element;
    }
//Naive Approach
//    public static int majorityElement(int[] nums) {
//        Map<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<nums.length;i++)
//        {
//            if(map.containsKey(nums[i]) ){
//                map.put(nums[i],map.get(nums[i])+1);
//            }
//            else{
//                map.put(nums[i],1);
//            }
//        }
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            Integer key = entry.getKey();
//            Integer value = entry.getValue();
//            if(value>nums.length/2)
//            {
//                return key;
//            }
//        }
//
//        return -1;
//    }

    public static void main(String[] args) {
        int nums[] =new int[]{1,2,3,3,3,3};
        System.out.println(majorityElement(nums));
    }
}

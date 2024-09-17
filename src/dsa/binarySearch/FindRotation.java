package dsa.binarySearch;

import java.util.ArrayList;
import java.util.List;

public class FindRotation {
    public static int findPivot(List<Integer> nums){
        int pivot = -1;
        int start=0;
        int end=nums.size()-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(start<mid && nums.get(mid)<nums.get(mid-1))
            {
                pivot=mid-1;
                break;
            }
            else if(end>mid && nums.get(mid)>nums.get(mid+1)){
            pivot =mid;
            break;
        }

            if(nums.get(start)>nums.get(mid)){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }

        return pivot+1;
    }
    public static void main(String[] args)
    {
        int []num=new int[]{7,8,9,1,2};
        List<Integer> nums=new ArrayList<>();
        for(int i:num)
        {
            nums.add(i);
        }


        System.out.println(findPivot(nums));
    }
}

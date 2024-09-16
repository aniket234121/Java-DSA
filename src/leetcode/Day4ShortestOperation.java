package leetcode;

import java.util.ArrayList;


public class Day4ShortestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int []nums= {14,12,14,14,12,14,14,12,12,12,12,14,14,12,14,14,14,12,12};
	System.out.println(minOperations(nums));

	}
	
	public static int minOperations(int[] nums) {
		
		if(nums.length<=1) {
			return -1;
		}
		
		int operation=0;
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		int value;

//checking for each value
		
		for(int i=0;i<nums.length;i++) 
		{
			
			value=nums[i];
			int count=1;
			
//if one time value is counted then this statement don't let it count again
			
			if(list.contains(value)) {            
				continue;
			}
			
//counting repeated values
			
			for(int j=i+1;j<nums.length;j++)
			{
				
				if(value==nums[j])
				{
					count++;
				}
			}
			list.add(value);
			
			if(count==1) {
				return -1;
			}
			else if(count%3==1) {
				operation=operation+(count/3)+1;
			}
			else if(count%3==2) {
				operation=operation+(count/3)+1;
			}
			else if(count%3==0) {
				operation=operation+(count/3);
			}
			
		}
				
				
				return operation; 



		    
		
		
	}

}

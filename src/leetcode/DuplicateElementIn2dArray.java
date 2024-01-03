package leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DuplicateElementIn2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]x= {1,2,3,4,1,2,3,2,5};
		findMatrix(x);
	}

	 public static List<List<Integer>> findMatrix(int[] nums) {
		
	        
	        
	        
	        int rows=0,count=1;
	        
	        for(int i=0;i<nums.length;i++)
	        {
	        	for(int j=i+1;j<nums.length;j++) {
	        		if(nums[i]==nums[j])
	        		{
	        			count++;
	        			
	        		}
	        	}
	        	
	        	if(rows<count) {
	        		rows=count;
	        	}
	        	count=1;
	        }
	        List<List<Integer>> lists=new ArrayList<List<Integer>>(rows);
	        for(int i=1;i<=rows;i++) {
	        	ArrayList<Integer> list=new ArrayList<Integer>();
	        	lists.add(list);
	        }
	        
	        
	        for(int i=0;i<nums.length;i++) {
	        	int value=nums[i];
	        	
	        	for(List<Integer> a:lists) {
	        		if(a.contains(value)) 
	        		{
	        			
	        		}
	        		else
	        		{
	        			a.add(value);
	        			break;
	        			
	        		}
	        			 
	        	}
	        }
	        

	        
	       for(List<Integer> i:lists) {
	    	   for(int j:i) {
	    		   System.out.println(j+" ");
	    	   }
	    	   System.out.println();
	       }
	        
	        return lists;
	        
	    }
}

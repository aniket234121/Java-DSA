package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class LightBeamsDay3 {

	public static void main(String[] args) {
		
		String[]bank= {"1","1"};
		System.out.println(lightBeams(bank));
	}

	public static int lightBeams(String[] bank) {
		int len=bank.length;
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<bank.length;i++) {
			
			int count=0;
			String s=bank[i];
			
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j)=='1') {
					count++;
					
				}
			}
			if(count!=0) {
				list.add(count);
			}
			
		}
		int []x=new int[list.size()];
		int k=0,total=0;
		for(Integer i:list) {
		  x[k]=i;
		  k++;		
		}
		System.out.println(Arrays.toString(x));
		
		for(int i=0;i<x.length-1;i++) {
			total=total+(x[i]*x[i+1]);
			
		}	
		return total;
	}
}

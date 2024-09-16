package dsa.binarySearch;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// applicable only for ascending order sorted.
		int []arr= {2,34,45,56,3,29,465};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(binarySearch(arr, 34));
	}
	public static int binarySearch(int [] arr,int target) {
		
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			int mid=(start+(end-start))/2;
			
			
			if(arr[mid]<target) {
				start=mid+1;
			}
			else if(arr[mid]>target) {
				end=mid-1;
			}
			else
			{
				return mid;
			}
			
		}
		
		
		return 0;
	}
}

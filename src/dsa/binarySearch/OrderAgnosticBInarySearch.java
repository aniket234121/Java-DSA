package dsa.binarySearch;

import java.util.Arrays;

public class OrderAgnosticBInarySearch {

	public static void main(String[] args) {
    //	int []arr = {1,23,34,45,56,67,78,89,90}; ascending
		int []arr= {99,87,76,65,54,43,3,2,-12}; //descending order
		System.out.println(Arrays.toString(arr));
		System.out.println(binarySearch(arr, 54));

	}
	public static int binarySearch(int []arr,int target) {
		int start=0;
		int end=arr.length-1;
		
		boolean isAscend;
		
		if(arr[start]<arr[end]) {
			isAscend=true;
		}
		else
		{
			isAscend=false;
		}
		while(start<=end) {

			int mid=start+(end-start)/2;
			
			if(arr[mid]==target)
			{
				return mid;
			}
			if(isAscend) {
				if(arr[mid]<target) {
					start=mid+1;
				}
				else if(arr[mid]>target) {
					end=mid-1;
				}
			}
			else {
				if(arr[mid]>target) {
					start=mid+1;
				}
				else if(arr[mid]<target) {
					end=mid-1;
				}
			}
		}
		
		return -1;
	}

}

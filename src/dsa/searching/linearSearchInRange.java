package dsa.searching;

import java.util.Scanner;

public class linearSearchInRange {
	public static void main(String[]args)
	{
		int start,end;
		int []x= {12,23,34,54,1,-23,-34,2};
		int target=-34;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the start range");
		start=sc.nextInt();
		System.out.println("enter the end range");
		end=sc.nextInt();
		
		sc.close();
		System.out.println(searchInRange(x, start, end, target));
		
		
	}
	public static boolean searchInRange(int[]x,int start,int end,int target) {
		if(end>x.length) {
			return false;
			}
		
		
		for (int i=start;i<=end;i++) {
			if(x[i]==target)
			{
				return true;
			}
		}
		return false;
	}

}

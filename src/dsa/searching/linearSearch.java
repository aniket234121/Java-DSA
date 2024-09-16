package dsa.searching;

public class linearSearch {
	public static void main(String []args)
	{
		int []a= {1,23,34,32,2,9};
		int target=3;
		boolean flag=linearSearch(a,target);
		
		if(flag)
		{
			System.out.println("element found.");
		}
		else {
			System.out.println("element not found.");
		}
	}
	
	public static boolean linearSearch(int[]ar,int target) {
		
		if(ar.length==0)
		{
			return false;
		}
		else{
			for(int i=0;i<ar.length;i++)
			{
				if(ar[i]==target)
				{
					return true;
				}
			}			
		}
		return false;
	}
}

package leetcode;

import java.util.Scanner;

public class SubStringequal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of string");
		String s=sc.nextLine();
		sc.close();
		System.out.println(maxLengthBetweenEqualCharacters(s));

	}
	public static int maxLengthBetweenEqualCharacters(String s) {
		
		char []ch=s.toCharArray();
		int end=0,start=0,len=0;
		
		
		for(int i=0;i<ch.length;i++)
		{ 
			for(int j=0;j<ch.length;j++)
			{
				if(i==j)
				{continue;}
				else if(ch[i]==ch[j]) 
				{
					if(len<=j-i-1)
					{
						System.out.println(i+" "+j);
						len=j-i-1;
						start=i;
						end=j;	
					}
					
				}
			}
			
			
		}
		if(len==0 &&(start+end)>=1) {
			System.out.println(1+" "+len+" "+start+" "+end);
			return 0;
		}
		else if(len==1&&(start+end)<2) {
			System.out.println(2+" "+len+" "+start+" "+end);
			return 0;
		}
		else if(len==0) {
			System.out.println(3+" "+len+" "+start+" "+end);
			return -1;
		}
		else {
			System.out.println(4+" "+len+" "+start+" "+end);
			return len;
		}
		
		
	}

}

package dsa.searching;

public class LinearSearInString {
public static void main(String[]args) {
	String value="aniket kumar";
	char target='a';
	
	System.out.println(searchInString(value,target));
	System.out.println(searchInString(value.toCharArray(), target));
}

public static boolean searchInString(String str,char target) {
	
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i) ==target)
		{
			return true;
		}
	}
	return false;
}
public static boolean searchInString(char[] str,char target) {
	
	for(char s:str) {
		if(s==target) {
			return true;
		}
	}
	return false;
}
}

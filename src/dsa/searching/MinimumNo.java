package dsa.searching;

public class MinimumNo {

	public static void main(String[] args) {
		int []x={9,23,5,45,56,2,3};
		
		System.out.println("minimum in arr: "+minimumNo(x));
		System.out.println("maximum in array: "+maximumNo(x));
	}
	public static int minimumNo(int[]x) {
		int num=x[0];
		for(int i=0;i<x.length;i++) {
			if(num>x[i]) {
				num=x[i];
			}
		}
		return num;
	}
	public static int maximumNo(int[]x) {
		int num=x[0];
		for(int i=0;i<x.length;i++) {
			if(num<x[i]) {
				num=x[i];
			}
		}
		return num;
	}

}

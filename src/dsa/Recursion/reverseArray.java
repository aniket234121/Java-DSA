package dsa.Recursion;

import java.util.Arrays;

public class reverseArray {
    public static void reverseArray(int[] arr,int index) {
     if(index>(arr.length-1)/2)
     {
         return;
     }
     arr[index]=arr[index]+arr[arr.length-1-index];
     arr[arr.length-1-index]=arr[index]-arr[arr.length-1-index];
     arr[index]=arr[index]-arr[arr.length-1-index];
     reverseArray(arr,index+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        reverseArray(arr,0);
        System.out.println(Arrays.toString(arr));
    }
}

import java.util.*;
class Permutations{
    public static void permutations(char[] arr,int index)
    {
        if(arr.length-1==index)
        {
            System.out.println(Arrays.toString(arr));
            return;
        }
        
        for(int i=index;i<arr.length;i++)
        {
            swap(arr,index,i);
            permutations(arr,index+1);
            swap(arr,index,i);
        }
        
    }
    public static void swap(char []arr,int j,int i)
    {
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
     permutations("abc".toCharArray(),0);
    }
}
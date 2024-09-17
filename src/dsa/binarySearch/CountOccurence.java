package dsa.binarySearch;

public class CountOccurence {
    public static int count(int[] arr, int x) {

        int start=0;
        int end=arr.length-1;
        int firstOccur=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(arr[mid]==x)
            {
                firstOccur=mid;
                end=mid-1;
            }
            else if(arr[mid]>x)
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }

        int lastOccur=-1;
        start=0;
        end=arr.length-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(arr[mid]==x)
            {
                lastOccur=mid;
                start=mid+1;
            }
            else if(arr[mid]<x)
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
    if(firstOccur==-1)
    {
        return -1;
    }
    return (lastOccur-firstOccur)+1;
    }

    public static void main(String[] args)
    {
        int nums[] =new int[]{2,2,2,2,2,3};
        System.out.println(count(nums,2));

    }
}

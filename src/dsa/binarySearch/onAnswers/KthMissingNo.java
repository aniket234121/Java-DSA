package dsa.binarySearch.onAnswers;

public class KthMissingNo {
    public static int findKthPositive(int[] arr, int k) {

        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int missing=arr[mid]-(mid+1);
            if( missing < k ){
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }


        return k+high+1;
    }
    public static void main(String[] args) {

        int nums[]=new int[]{1,2,3,4};
        System.out.println(findKthPositive(nums,2));
    }
}

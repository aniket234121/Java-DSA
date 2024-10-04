package dsa.binarySearch.onAnswers;

public class CapacityToShipDdays {

    public static int findDays(int[]weights,int capacity){

        int sum=0;
        int count=1;
        for(int i=0;i<weights.length;i++){
            if((sum+weights[i])<=capacity)
            {
                sum+=weights[i];
            }
            else {
                count++;
                sum=weights[i];
            }
        }

        return count;
    }

    public static int shipWithinDays(int[] weights, int days) {

        int low=1;
        int high=0;
        for(int i:weights)
        {
            high+=i;
            low=Math.max(low,i);
        }

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(findDays(weights,mid)<=days)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

    public static void main(String[] args) {

        int nums[]=new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(shipWithinDays(nums,5));
    }
}

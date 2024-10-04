package dsa.binarySearch.onAnswers;

public class kokoEatingBanana {
    public static int findMax(int []nums){
        int max=Integer.MIN_VALUE;
        for(int i:nums)
        {
         if(i>max)
         {max=i;}
        }
        return max;
    }
    public static int findHours(int []piles,int val)
    {
        int sum=0;
        for(int i=0;i<piles.length;i++)
        {
            sum+= (int) Math.ceil((double)piles[i]/(double)val);
        }
        return sum;
    }
    public static int minEatingSpeed(int[] piles, int h) {

        int low=1; int high=findMax(piles);

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int totalHours=findHours(piles,mid);
            if(totalHours<=h)
            {
                high=mid-1;
            }
            else {
                low=mid+1;
            }

        }

        return low;
    }

    public static void main(String[] args) {
        int []nums=new int[]{805306368,805306368,805306368};
        System.out.println(minEatingSpeed(nums,1000000000));
    }
}

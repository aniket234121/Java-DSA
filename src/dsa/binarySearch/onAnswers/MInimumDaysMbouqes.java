package dsa.binarySearch.onAnswers;

public class MInimumDaysMbouqes {

    public static int []MinMax(int []nums){
        int res[]=new int[2];
        res[0]=Integer.MIN_VALUE;//max
        res[1]=Integer.MAX_VALUE;//min
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>res[0])
            {
                res[0]=nums[i];
            }
            if(nums[i]<res[1])
            {
                res[1]=nums[i];
            }
        }

        return res;
    }

    public static int findBouqes(int []nums,int day,int adj){

        int bouqes=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(day>=nums[i])
            {
                count++;
            }
            else{
                bouqes+=count/adj;
                count=0;
            }
        }
        if(count!=0)
        {
            bouqes+=count/adj;
        }


        return bouqes;

    }
    public static int minDays(int[] bloomDay, int m, int k) {
        long val=(long)m*k;
        if(val>bloomDay.length)
        {
            return -1;
        }
        int []ans=MinMax(bloomDay);
        int high=ans[0];
        int low=ans[1];

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int bouqes=findBouqes(bloomDay,mid,k);
            if(bouqes>=m)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }

        return low;
    }
    public static void main(String[] args) {
        int []bloomDay={7,7,7,7,12,7,7 };
        System.out.println(minDays(bloomDay,2,3));

    }
}

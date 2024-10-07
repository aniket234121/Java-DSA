package dsa.binarySearch.onAnswers;

import java.util.Arrays;

public class Peak2DII {
        public static boolean check(int[][]matrix,int cmid,int rmid)
        {
            boolean hasUpperEl=cmid>0;
            boolean hasLowerEl=cmid<matrix.length-1;
            boolean hasLeftEl=rmid>0;
            boolean hasRightEl=rmid<matrix[0].length-1;

            if(hasUpperEl && !(matrix[cmid][rmid] > matrix[cmid-1][rmid]) )
            {
                return false;
            }
            if(hasLowerEl && !(matrix[cmid][rmid] > matrix[cmid+1][rmid]) )
            {
                return false;
            }
            if(hasLeftEl && !(matrix[cmid][rmid] > matrix[cmid][rmid-1]) )
            {
                return false;
            }
            if(hasRightEl && !(matrix[cmid][rmid] > matrix[cmid][rmid+1]) )
            {
                return false;
            }
            return true;
        }

        public static int[] OneD(int[][] nums,int cmid)
        {   int res[]=new int[]{-1,-1};
            int low=0;
            int high=nums[cmid].length-1;
            while(low<=high)
            {
                int rmid=low+(high-low)/2;
                if(check(nums,cmid,rmid))
                {
                 res[0]=cmid;
                 res[1]=rmid;
                 return res;
                }
                //low of row cmid
                if(check(nums,cmid,low))
                {
                    res[1]=low;
                    res[0]=cmid;
                    return res;
                }
                else{
                    low++;
                }
                if(check(nums,cmid,high))
                {
                    res[1]=high;
                    res[0]=cmid;
                    return res;
                }
                else{
                    high--;
                }
            }
            return res;
        }
        public static int[] findPeakGrid(int[][] mat) {

            int clow=0;
            int chigh=mat.length-1;

            while(clow<=chigh){
                int cmid=clow+(chigh-clow)/2;
                int[] temp=OneD(mat,cmid);
                if(temp[0]!=-1){

                    return temp;
                }
                temp=OneD(mat,clow);
                if(temp[0]!=-1){

                    return temp;
                }
                else{
                    clow++;
                }
                temp=OneD(mat,chigh);
                if(temp[0]!=-1){
                    return temp;
                }
                else{
                    chigh--;
                }

            }


            return new int[]{-1,-1};
        }



    public static void main(String[] args) {d
            int matrix[][]=new int[][]{ {70,50,40,30,20},{100,1,2,3,4}};
            System.out.println(Arrays.toString(findPeakGrid(matrix)));
        }

}

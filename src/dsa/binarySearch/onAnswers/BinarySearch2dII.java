package dsa.binarySearch.onAnswers;

public class BinarySearch2dII {
    public static boolean searchMatrix(int[][] matrix, int target) {

//        row [0-rhigh]
        int Rlow=0;
        int Rhigh=matrix[0].length-1;
        while(Rlow<=Rhigh)
        {
            int mid=Rlow+(Rhigh-Rlow)/2;
            if(matrix[0][mid]==target)return true;
            else if(matrix[0][mid]>target) Rhigh=mid-1;
            else Rlow=mid+1;
        }
        //column [0 -chigh]
        int Clow =0;
        int Chigh=matrix.length-1;
        while(Clow <=Chigh)
        {
            int mid= Clow +(Chigh- Clow)/2;
            if(matrix[mid][0]==target)return true;
            else if(matrix[mid][0]>target) Chigh=mid-1;
            else Clow =mid+1;
        }

        for(int i=0;i<=Chigh;i++)
        {
            int low=0;
            int high=Rhigh;
            while(low<=high)
            {
                int mid= low+(high-low)/2;
                if(matrix[i][mid]==target)return true;
                else if(matrix[i][mid]<target)low=mid+1;
                else high=mid-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}}
        int matrix[][]=new int[][]{{1,1}};
        System.out.println(searchMatrix(matrix,2));
    }
}

package dsa.Arrays;

import java.util.Arrays;

public class SetMatrixZeros {

    public static void setZeroes(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int[] ColZero=new int[cols];
        int [] RowZero=new int[rows];

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(matrix[i][j]==0)
                {
                    ColZero[j]=1;
                    RowZero[i]=1;
                }
            }
        }

        for(int i=0;i<cols;i++)
        {
            if(ColZero[i]==1)
            {
                for(int j=0;j<rows;j++)
                {
                    matrix[j][i]=0;
                }
            }
        }
        for(int i=0;i<rows;i++)
        {
            if(RowZero[i]==1)
            {
                for(int j=0;j<cols;j++)
                {
                    matrix[i][j]=0;
                }
            }
        }
    }
    public static void main(String[] args) {


        int nums[][]=new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};

        for(int []i:nums)
        {
            System.out.println(Arrays.toString(i));
        }
        System.out.println("after Setting zeros");
        setZeroes(nums);
        for(int []i:nums)
        {
            System.out.println(Arrays.toString(i));
        }
    }


}

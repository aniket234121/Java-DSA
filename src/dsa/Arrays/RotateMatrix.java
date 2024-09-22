package dsa.Arrays;

import java.util.Arrays;

public class RotateMatrix {
    public static void rotate(int[][] matrix) {
        for(int i=1;i<matrix.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                matrix[i][j]=matrix[i][j]^matrix[j][i];
                matrix[j][i]=matrix[i][j]^matrix[j][i];
                matrix[i][j]=matrix[i][j]^matrix[j][i];
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
             int j=0;
             int k=matrix[i].length-1;
             while(j<k)
             {
                 int temp=matrix[i][j];
                 matrix[i][j]=matrix[i][k];
                 matrix[i][k]=temp;
                 j++;
                 k--;
             }
        }
    }

    public static void main(String[] args) {
        int nums[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};

        for(int []i:nums)
        {
            System.out.println(Arrays.toString(i));
        }
        System.out.println("after rotating matrix");
        rotate(nums);
        for(int []i:nums)
        {
            System.out.println(Arrays.toString(i));
        }
    }
}

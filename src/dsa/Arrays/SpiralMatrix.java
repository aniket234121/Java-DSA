package dsa.Arrays;

import java.util.*;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int left=0;
        int right=matrix[0].length-1;
        int top=0;
        int bottom=matrix.length-1;
        while(left<=right&&top<=bottom)
        {
            for(int i=left; i<=right; i++)
            {
                list.add(matrix[top][i]);

            }
            top++;
            for(int i=top; i<=bottom; i++)
            {
                list.add(matrix[i][right]);

            }
            right--;
            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }

        }

        return list;
    }

    public static void main(String[] args) {
        int nums[][]=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        for(int []i:nums)
        {
            System.out.println(Arrays.toString(i));
        }
        System.out.println("Spiral Rotation of Matrix");
        System.out.println(spiralOrder(nums));
    }
}

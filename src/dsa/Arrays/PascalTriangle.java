package dsa.Arrays;

import java.util.*;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for(int i=1; i<=numRows; i++) {
            List<Integer> row = new ArrayList<>();
            int ans=1;
            row.add(ans);
            for(int j=1; j<i; j++) {
                ans=ans*(i-j)/j;
                row.add(ans);
            }
            result.add(row);
        }

        return result;
    }
    public static void main(String[] args) {
        List<List<Integer>> result=generate(5);
        System.out.println(result);
    }
}

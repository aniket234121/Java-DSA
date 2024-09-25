package dsa.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeOverlappingInterval {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        List<List<Integer>> lists=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            if(lists.isEmpty() || intervals[i][0]>lists.get(lists.size()-1).get(1))
            {
                lists.add(Arrays.asList(intervals[i][0],intervals[i][1]) );
            }
            else{
                lists.get(lists.size()-1).set( 1, Math.max( lists.get(lists.size()-1).get(1),intervals[i][1] ));
            }
        }
        int ans[][]=new int[lists.size()][2];
        int i=0;
        for(List<Integer> list:lists){
            ans[i][0]=list.get(0);
            ans[i][1]=list.get(1);
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int num[][]=new int[][]{{1,3},{2,6},{8,10},{15,18}};
        num=merge(num);
        for(int[] n:num)
        {
            System.out.println(Arrays.toString(n));
        }
    }
}

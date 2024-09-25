package dsa.Arrays;

import java.util.Arrays;

public class MergeSortedArray {
//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        int i = 0, j = 0;
//        int []ans = new int[m + n];
//        int count=0;
//        while (i < m && j < n) {
//            if (nums1[i]<=nums2[j])
//            {
//                ans[count] = nums1[i];
//                count++;
//                i++;
//            }
//            else {
//                ans[count] = nums2[j];
//                count++;
//                j++;
//            }
//        }
//        if(i < m)
//        {
//            while(i<m)
//            {
//                ans[count] = nums1[i];
//                count++;
//                i++;
//            }
//        }
//        if(j<n)
//        {
//            while(j<n)
//            {
//                ans[count] = nums2[j];
//                count++;
//                j++;
//            }
//        }
//        for(int k=0;k<nums1.length;k++)
//        {
//            nums1[k]=ans[k];
//        }
//
//    }
public static void merge(int[] arr1, int n, int[] arr2, int m) {


    int left=n;
    int right=0;
    while(left<arr1.length && right<m)
    {
        arr1[left]=arr2[right];
        left++;
        right++;
    }
    Arrays.sort(arr1);

}
    public static void main(String[] args) {
        int num[]=new int[]{4,5,6,0,0,0};
        int num2[]=new int[]{1,2,3};
        merge(num,3,num2,3);
        System.out.println(Arrays.toString(num));
    }
}

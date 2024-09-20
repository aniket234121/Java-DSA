package dsa.Arrays;

import java.util.Arrays;

public class QuickSort {
    //Sort Colors Problem Q.75 leetcode
    public static int partition(int array[], int low, int high)
    {
        int pivot = array[high];


        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {

                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return (i + 1);
    }

    static void quickSort(int array[], int low, int high) {
        if (low < high) {

            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);

            quickSort(array, pi + 1, high);
        }
    }

    public static void sortColors(int[] nums) {
        quickSort(nums,0,nums.length-1);
    }

    public static void main(String[] args) {
        int nums[]=new int[]{0,1,2,1,2,0,0,2,1};
        System.out.println(Arrays.toString(nums));
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}

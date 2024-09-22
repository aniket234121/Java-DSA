package dsa.Arrays;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int max = Integer.MIN_VALUE;
        if (nums.length == 1 || nums.length == 2 && nums[0] == nums[1]) {
            return 1;
        } else if (nums.length == 0) {
            return 0;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;
            if (nums[j] - nums[i] == 1) {
                count++;
            } else if (nums[j] - nums[i] == 0) {
                continue;
            } else {
                count = 0;
            }
            if (count > max) {
                max = count;
            }
        }

        return max + 1;
    }

    public static void main(String[] args) {
        int nums[]=new int[]{0,0};
        System.out.println(longestConsecutive(nums));
    }
}

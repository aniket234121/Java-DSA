package Patterns.SlidingWindow;
import java.util.*;

public class MonotonicSlidingWIndow {

        public static int[] maxSlidingWindow(int[] nums, int k) {
            Deque<Integer> dq = new ArrayDeque<>();
            int n = nums.length;
            int[] result = new int[n - k + 1];

            for (int i = 0; i < n; i++) {
                // Step 1: Remove out-of-window indexes
                if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                    dq.pollFirst();
                }

                // Step 2: Remove all smaller numbers from the back
                while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                    dq.pollLast();
                }

                // Step 3: Add current index
                dq.offerLast(i);

                // Step 4: Store result once the window hits size k
                if (i >= k - 1) {
                    result[i - k + 1] = nums[dq.peekFirst()];
                }
            }

            return result;
        }


        public static void main(String[] args) {
            int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
            int k = 3;
            int[] result = maxSlidingWindow(nums, k);
            System.out.println(Arrays.toString(result));  // Output: [3, 3, 5, 5, 6, 7]
        }



}

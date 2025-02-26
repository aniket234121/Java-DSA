import java.util.*;

class LetterCasePermutation {
    public static void letterCasePermutation(char[] arr, int index) {
        if (index == arr.length) { // ✅ Fix base case
            System.out.println(new String(arr)); // ✅ Fix print statement
            return;
        }
        
        // If it's a lowercase letter
        if (arr[index] >= 'a' && arr[index] <= 'z') { 
            letterCasePermutation(arr, index + 1); // ✅ Continue without change
            arr[index] = (char) (arr[index] - 32); // ✅ Convert to uppercase
            letterCasePermutation(arr, index + 1); // ✅ Explore new case
            arr[index] = (char) (arr[index] + 32); // ✅ Restore for backtracking
        }
        // If it's an uppercase letter
        else if (arr[index] >= 'A' && arr[index] <= 'Z') { 
            letterCasePermutation(arr, index + 1);
            arr[index] = (char) (arr[index] + 32);
            letterCasePermutation(arr, index + 1);
            arr[index] = (char) (arr[index] - 32);
        } 
        // If it's a digit, just move forward
        else {
            letterCasePermutation(arr, index + 1);
        }
    }

    public static void main(String[] args) {
        String s = "a1b2";
        letterCasePermutation(s.toCharArray(), 0);
    }
}

package dsa.binarySearch.onAnswers;

public class BInarySearch2D {
    public static boolean searchMatrix(int[][] matrix, int target) {
            int start = 0;
            int end = matrix.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if(target==matrix[mid][0]) return true;
                if (target > matrix[mid][0]) {

                    int low = 0;
                    int high = matrix[mid].length - 1;
                    if (target >= matrix[mid][low] && target <= matrix[mid][high]) {
                        while (low <= high) {
                            int middle = low + (high - low) / 2;
                            if (matrix[mid][middle] == target) {
                                return true;
                            } else if (matrix[mid][middle] > target) {
                                high = middle - 1;
                            } else {
                                low = middle + 1;
                            }
                        }
                        return false;
                    }
                    start = mid + 1;
                }else {
                    end=mid-1;
                }
            }
            return false;
        }

    public static void main(String[] args) {
        int matrix[][]=new int[][]{{1,3}};
        System.out.println(searchMatrix(matrix,3));
    }
}

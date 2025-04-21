public class searchMatrix_74 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        if (target > matrix[m - 1][n - 1] || target < matrix[0][0]) {
            return false;
        }
        int left = 0;
        int right = m * n - 1;
        int mid = (left + right) / 2;
        while (left <= right) {
            int mid_row = mid / n;
            int mid_col = mid % n;
            if (matrix[mid_row][mid_col] == target) {
                return true;
            } else if (matrix[mid_row][mid_col] < target) {
                left = mid + 1;
                mid = (left + right) / 2;
            } else {
                right = mid - 1;
                mid = (left + right) / 2;
            }
        }

        return false;


    }
}

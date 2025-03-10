public class setZeroes_73 {
    //通常情况下使用m+n数组记录行列是否要置0的信息，
    //但在要求空间复杂度的情况下，需要利用矩阵本身记录信息
    public static void setZeroes(int[][] matrix) {
        boolean row_has_zero = false;
        boolean low_has_zero = false;
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                row_has_zero = true;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                low_has_zero = true;
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for (int i = 1; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                for (int[] row : matrix) {
                    row[i] = 0;
                }
            }

        }

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (low_has_zero) {
            for (int[] row : matrix) {
                row[0] = 0;
            }
        }
        if (row_has_zero) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }


    }
}

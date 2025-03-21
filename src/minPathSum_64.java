public class minPathSum_64 {
    public static int minPathSum(int[][] grid) {
        //res[i][j] = Min(res[i-1][j],res[i][j-1]) + grid[i][j]
        int[][] res = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            if(i==0)
                res[i][0] = grid[i][0];
            else
                res[i][0] = res[i-1][0] + grid[i][0];
        }
        for(int j =0;j<grid[0].length;j++){
            if(j == 0)
                res[0][j] = grid[0][j];
            else
                res[0][j] = res[0][j-1] + grid[0][j];
        }


        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                res[i][j] = Math.min(res[i - 1][j], res[i][j - 1]) + grid[i][j];
            }
        }
        return res[grid.length - 1][grid[0].length - 1];

    }
}

import java.util.LinkedList;
import java.util.Queue;

public class OrangesRotting_994 {
    public static int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int lows = grid[0].length;
        int fresh = 0;//记录有多少新鲜橘子 用来终止查找
        Queue<int[]> queue = new LinkedList<>();
        int[][] dirs = {{0, 1}, {-1, 0}, {0, -1}, {1, 0}};
        int minutes = -1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < lows; j++) {
                if (grid[i][j] == 1)
                    fresh++;
                if (grid[i][j] == 2)
                    queue.add(new int[]{i, j});
            }
        }
        if (fresh == 0)
            return 0;

        while (!queue.isEmpty()) {//模拟腐烂过程，即探索所有腐烂橘子
            //Q:如何维护时间的变量?一层一个queue？ A:计算每层length,探索完length后就是下一层
            int levelSize = queue.size();
            minutes++;
            for (int i = 0; i < levelSize; i++) {
                int[] cur = queue.poll();
                for (int[] dir : dirs) {
                    int next_row = cur[0] + dir[0];
                    int next_low = cur[1] + dir[1];
                    if (next_row >= 0 && next_row < rows && next_low >= 0 && next_low < lows && grid[next_row][next_low] == 1) {
                        grid[next_row][next_low] = 2;
                        fresh--;
                        queue.add(new int[]{next_row, next_low});
                    }
                }
            }

        }
        if (fresh == 0)
            return minutes;
        else
            return -1;
    }
}

import java.util.ArrayList;
import java.util.List;

public class spiralOrder_54 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        //一直朝一个方向探索，当到边界或到下一个是已探索过则改变方向，直到探索结束

        int n = matrix.length * matrix[0].length;
        boolean[][] isVisited = new boolean[matrix.length][matrix[0].length];
        int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        List<Integer> res = new ArrayList<>();
        int x = 0;
        int y = 0;
        int dirIndex = 0;
        for (int count = 0; count < n; ) {
            res.add(matrix[x][y]);
            isVisited[x][y] = true;
            count++;

            int next_x = x + dir[dirIndex % 4][0];
            int next_y = y + dir[dirIndex % 4][1];
            if (isInMatrix(next_x, next_y, matrix.length, matrix[0].length)) {
                if (!isVisited[next_x][next_y]) {
                    x = next_x;
                    y = next_y;
                } else {
                    //下一个节点在数组内部但已经被探索了
                    dirIndex++;
                    x = x + dir[dirIndex % 4][0];
                    y = y + dir[dirIndex % 4][1];
                }
            } else {
                //下一个节点在数组外部
                dirIndex++;
                x = x + dir[dirIndex % 4][0];
                y = y + dir[dirIndex % 4][1];
            }
        }
        return res;
    }

    static boolean isInMatrix(int x, int y, int x_size, int y_size) {
        return (x >= 0 && y >= 0 && x < x_size && y < y_size);
    }
}

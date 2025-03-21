import org.junit.Test;
import static org.junit.Assert.*;
public class Test_64_minPathSum {
    @Test
    public void test()
    {
        int[][] grid = {
                {1,3,1},
                {1,5,1},
                {4,2,1}
        };
        assertEquals(7, minPathSum_64.minPathSum(grid));
    }

    @Test
    public void test1()
    {
        int[][] grid = {
                {1,2,3},
                {4,5,6}
        };
        assertEquals(12, minPathSum_64.minPathSum(grid));
    }
}

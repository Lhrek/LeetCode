import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Test_994_OrangeRotting {
    @Test
    public void testCommon(){
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        assertEquals(4,OrangesRotting_994.orangesRotting(grid));
    }

    @Test
    public void testImpossible(){
        int[][] grid= {{2,1,1},{0,1,1},{1,0,1}};
        assertEquals(-1,OrangesRotting_994.orangesRotting(grid));
    }

    @Test
    public void testZero(){
        int[][] grid = {{0,2}};
        assertEquals(0,OrangesRotting_994.orangesRotting(grid));
    }

}

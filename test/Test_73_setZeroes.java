import org.junit.Test;
import static org.junit.Assert.*;
public class Test_73_setZeroes {
    @Test
    public void test()
    {
        int[][] matrix = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        setZeroes_73.setZeroes(matrix);
        assertArrayEquals(new int[][]{
                {1,0,1},
                {0,0,0},
                {1,0,1}
        },matrix);
    }
    @Test
    public void test1()
    {
        int[][] matrix = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        setZeroes_73.setZeroes(matrix);
        assertArrayEquals(new int[][]{
                {0,0,0,0},
                {0,4,5,0},
                {0,3,1,0}
        },matrix);
    }
}

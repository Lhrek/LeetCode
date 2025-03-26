import org.junit.Test;
import static org.junit.Assert.*;
public class Test_74_searchMatrix {
    @Test
    public void test()
    {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        assertTrue(searchMatrix_74.searchMatrix(matrix, 3));
        assertFalse(searchMatrix_74.searchMatrix(matrix, 13));
    }

    @Test
    public void test1()
    {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        assertTrue(searchMatrix_74.searchMatrix(matrix, 11));
        assertFalse(searchMatrix_74.searchMatrix(matrix, 13));
    }
}

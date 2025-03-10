import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Test_54_spiralOrder {
    @Test
    public void test()
    {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> expected = List.of(1,2,3,6,9,8,7,4,5);
        List<Integer> actual = spiralOrder_54.spiralOrder(matrix);
        assertEquals(expected.size(), actual.size());
        assertEquals(expected,actual);

    }

    @Test
    public void test1()
    {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> expected = List.of(1,2,3,4,8,12,11,10,9,5,6,7);
        List<Integer> actual = spiralOrder_54.spiralOrder(matrix);
        assertEquals(expected.size(), actual.size());
       assertEquals(expected,actual);
    }
}

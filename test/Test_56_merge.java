import org.junit.Test;
import static org.junit.Assert.*;

public class Test_56_merge
{
    @Test
    public void test()
    {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] expected = {{1,6},{8,10},{15,18}};
        assertArrayEquals(expected, merge_56.merge(intervals));
    }

    @Test
    public void test1()
    {
        int[][] intervals = {{1,4},{4,5}};
        int[][] expected = {{1,5}};
        assertArrayEquals(expected, merge_56.merge(intervals));
    }
}

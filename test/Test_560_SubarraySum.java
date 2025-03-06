import org.junit.Test;
import static org.junit.Assert.*;

public class Test_560_SubarraySum {
    @Test
    public void test()
    {
        int[] nums = {1,2,3};
        int k = 3;
        int expected = 2;
        int actual = SubarraySum_560.subarraySum(nums, k);
        assertEquals(expected, actual);
    }
    @Test
    public void test1()
    {
        int[] nums = {1};
        int k = 0;
        int expected = 0;
        int actual = SubarraySum_560.subarraySum(nums, k);
        assertEquals(expected, actual);
    }
}

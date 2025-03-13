import org.junit.Test;
import static org.junit.Assert.*;
public class Test_300_lengthOfLIS {
    @Test
    public void test()
    {
        int[] nums = {10,9,2,5,3,7,101,18};
        assertEquals(4, lengthOfLIS_300.lengthOfLIS(nums));
    }

    @Test
    public void test1()
    {
        int[] nums = {0,1,0,3,2,3};
        assertEquals(4, lengthOfLIS_300.lengthOfLIS(nums));
    }

    @Test
    public void test2()
    {
        int[] nums = {4,10,4,3,8,9};
        assertEquals(3, lengthOfLIS_300.lengthOfLIS(nums));
    }
}

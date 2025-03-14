import org.junit.Test;
import static org.junit.Assert.*;
public class Test_287_findDuplicate {
    @Test
    public void test()
    {
        int[] nums = {1,3,4,2,2};
        assertEquals(2,findDuplicate_287.findDuplicate(nums));
    }
    @Test
    public void test1()
    {
        int[] nums = {3,1,3,4,2};
        assertEquals(3,findDuplicate_287.findDuplicate(nums));
    }
}

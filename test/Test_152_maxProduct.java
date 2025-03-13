import org.junit.Test;
import static org.junit.Assert.*;
public class Test_152_maxProduct {
    @Test
    public void test()
    {
        int[] nums = {2,3,-2,4};
        assertEquals(6, maxProduct_152.maxProduct(nums));
    }

    @Test
    public void test1()
    {
        int[] nums = {-2,0,-1};
        assertEquals(0, maxProduct_152.maxProduct(nums));
    }
}


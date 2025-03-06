import org.junit.Test;
import static org.junit.Assert.*;
public class Test_238_productExceptSelf {
    @Test
    public void test()
    {
        int[] nums = {1,2,3,4};
        int[] expected = {24,12,8,6};
        int[] actual = productExceptSelf_238.productExceptSelf(nums);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2()
    {
        int[] nums = {-1,1,0,-3,3};
        int[] expected = {0,0,9,0,0};
        int[] actual = productExceptSelf_238.productExceptSelf(nums);
        assertArrayEquals(expected, actual);
    }
}

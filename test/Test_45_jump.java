import org.junit.Test;
import static org.junit.Assert.*;
public class Test_45_jump {
    @Test
    public void test0()
    {
        int[] nums = {2,3,1,1,4};
        int expected = 2;
        int actual = jump_45.jump(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test1()
    {
        int[] nums = {2,3,0,1,4};
        int expected = 2;
        int actual = jump_45.jump(nums);
        assertEquals(expected, actual);
    }
}

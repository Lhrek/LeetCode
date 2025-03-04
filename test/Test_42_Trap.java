import org.junit.Test;

import static org.junit.Assert.*;

public class Test_42_Trap {
    @Test
    public void test0()
    {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        assertEquals(6, Trap_42.trap(height));
    }

    @Test
    public void test1()
    {
        int[] height = {4,2,0,3,2,5};
        assertEquals(9, Trap_42.trap(height));
    }
}

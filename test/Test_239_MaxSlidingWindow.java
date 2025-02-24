import org.junit.Test;

import static org.junit.Assert.*;

public class Test_239_MaxSlidingWindow {
    @Test
    public void testGeneral() {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int[] exp = {3,3,5,5,6,7};
        assertArrayEquals(exp, MaxSlidingWindow_239.maxSlidingWindow(nums, 3));
    }

    @Test
    public void testSingle(){
        int[] nums = {1};
        int[] exp = {1};
        assertArrayEquals(exp,MaxSlidingWindow_239.maxSlidingWindow(nums,1));
    }
}

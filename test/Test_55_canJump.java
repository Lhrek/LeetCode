import org.junit.Test;
import static org.junit.Assert.*;
public class Test_55_canJump {
    @Test
    public void test(){
        int[] nums = {2,3,1,1,4};
        assertTrue(canJump_55.canJump(nums));
    }
    @Test
    public void test1(){
        int[] nums = {3,2,1,0,4};
        assertFalse(canJump_55.canJump(nums));
    }
}

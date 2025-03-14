import org.junit.Test;
import static org.junit.Assert.*;
public class Test_416_canPartition {
    @Test
    public void testGeneral()
    {
        int[] nums = {1,5,11,5};
        assertTrue(canPartition_416.canPartition(nums));
    }

    @Test
    public void testSingle()
    {
        int[] nums = {1};
        assertFalse(canPartition_416.canPartition(nums));
    }
}

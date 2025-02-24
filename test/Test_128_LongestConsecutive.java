import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Test_128_LongestConsecutive {
    @Test
    public void test0(){
        int[] nums = {100,4,200,1,3,2};
        assertEquals(4,LongestConsecutive_128.longestConsecutive(nums));
    }

    @Test
    public void test1(){
        int[] nums = {0,3,7,2,5,4,6,0,1};
        assertEquals(8,LongestConsecutive_128.longestConsecutive(nums));
    }
}

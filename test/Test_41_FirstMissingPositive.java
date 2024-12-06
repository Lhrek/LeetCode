import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Test_41_FirstMissingPositive {
    @Test
    public void test0(){
        int[] nums = {1,2,0};
        assertEquals(3,FirstMissingPositive_41.firstMissingPositive(nums));
    }

    public void test1(){
        int[] nums = {3,4,-1,1};
        assertEquals(2,FirstMissingPositive_41.firstMissingPositive(nums));
    }

    public void test3(){
        int[] nums = {7,8,9,11,12};
        assertEquals(1,FirstMissingPositive_41.firstMissingPositive(nums));
    }
}

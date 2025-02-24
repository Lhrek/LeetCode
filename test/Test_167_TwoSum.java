import org.junit.Test;
import static org.junit.Assert.*;
public class Test_167_TwoSum {
    @Test
    public void test(){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] res = {1,2};
        assertArrayEquals(res,TwoSum_167.twoSum(nums,target));
    }

    @Test
    public void test2(){
        int[] nums = {2,3,4};
        int target = 6;
        int[] res = {1,3};
        assertArrayEquals(res,TwoSum_167.twoSum(nums,target));
    }
}

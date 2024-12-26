import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Test_34_SearchRange {
    @Test
    public void notFound(){
        int[] nums = new int[]{5,7,7,8,8,10};
        int[] expect = new int[]{-1,-1};
        assertEquals(expect,SearchRange_34.searchRange(nums,6));
    }
    @Test
    public void nullNums(){
        int[] nums = new int[]{};
        int[] expect = new int[]{-1,-1};
        assertEquals(expect,SearchRange_34.searchRange(nums,0));
    }
    @Test
    public void test(){
        int[] nums = new int[]{5,7,7,8,8,10};
        int[] expect = new int[]{3,4};
        assertEquals(expect,SearchRange_34.searchRange(nums,8));
    }

}

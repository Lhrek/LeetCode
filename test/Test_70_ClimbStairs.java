import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Test_70_ClimbStairs {
    @Test
    public void testClimbStairsDyn(){
        assertEquals("2楼有2种上楼方式",2, ClimbStairs_70.climbStairs_dyn(2));
    }

}

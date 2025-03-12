import org.junit.Test;
import static org.junit.Assert.*;
public class Test_739_dailyTemperatures {
    @Test
    public void test()
    {
        dailyTemperatures_739 dailyTemperatures_739 = new dailyTemperatures_739();
        int[] temperatures = {73,74,75,71,69,72,76,73};
        int[] expected = {1,1,4,2,1,1,0,0};
        assertArrayEquals(expected, dailyTemperatures_739.dailyTemperatures(temperatures));
    }

    @Test
    public void test1()
    {
        dailyTemperatures_739 dailyTemperatures_739 = new dailyTemperatures_739();
        int[] temperatures = {30,40,50,60};
        int[] expected = {1,1,1,0};
        assertArrayEquals(expected, dailyTemperatures_739.dailyTemperatures(temperatures));
    }
}

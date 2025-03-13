import org.junit.Test;
import static org.junit.Assert.*;
public class Test_322_coinChange {
    @Test
    public void test()
    {
        int[] coins = {1,2,5};
        int amount = 11;
        int expected = 3;
        int actual = coinChange_322.coinChange(coins, amount);
        assertEquals(expected, actual);
    }

    @Test
    public void test1()
    {
        int[] coins = {2};
        int amount = 3;
        int expected = -1;
        int actual = coinChange_322.coinChange(coins, amount);
        assertEquals(expected, actual);
    }
}

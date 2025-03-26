import org.junit.Test;
import static org.junit.Assert.*;
public class Test_72_minDistance {
    @Test
    public void test()
    {
        String word1 = "horse";
        String word2 = "ros";
        assertEquals(3, minDistance_72.minDistance(word1, word2));
    }

    @Test
    public void test1()
    {
        String word1 = "intention";
        String word2 = "execution";
        assertEquals(5, minDistance_72.minDistance(word1, word2));
    }
}

import org.junit.Test;
import static org.junit.Assert.*;
public class Test_76_minWindow {
    @Test
    public void test()
    {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = minWindow_76.minWindow(s,t);
        assertEquals("BANC",result);
    }

    @Test
    public void test1()
    {
        String s = "a";
        String t = "a";
        String result = minWindow_76.minWindow(s,t);
        assertEquals("a",result);
    }
}

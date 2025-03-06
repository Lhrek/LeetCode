import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Test_438_FindAnagrams {
    @Test
    public void test0()
    {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> ans = FindAnagrams_438.findAnagrams(s, p);
        List<Integer> exp = Arrays.asList(0, 6);
        assertEquals(exp, ans);
    }

    @Test
    public void test1()
    {
        String s = "abab";
        String p = "ab";
        List<Integer> ans = FindAnagrams_438.findAnagrams(s, p);
        List<Integer> exp = Arrays.asList(0, 1, 2);
        assertEquals(exp, ans);
    }

}

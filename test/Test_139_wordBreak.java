import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
public class Test_139_wordBreak {
    @Test
    public void test()
    {
        String s = "leetcode";
        String[] wordDict = {"leet","code"};
        assertEquals(true, wordBreak_139.wordBreak(s, List.of(wordDict)));
    }

    @Test
    public void test1()
    {
        String s = "applepenapple";
        String[] wordDict = {"apple","pen"};
        assertEquals(true, wordBreak_139.wordBreak(s, List.of(wordDict)));
    }
}

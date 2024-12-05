import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Test_5_LongestPalindrome {
    @Test
   public void teset_adjin(){
        String s = "cbbd";
        assertEquals("bb",LongestPalindrome_5.longestPalindrome(s));
    }
    public void test(){
        String s = "bcabacd";
        assertEquals("cabac",LongestPalindrome_5.longestPalindrome(s));
    }
}

import org.junit.Test;

import static org.junit.Assert.*;


public class Test_455_FindContentChildren {
    @Test
    public void test(){
        int[] g = {1,2,3};
        int[] s = {1,1};
        assertEquals(1,FindContentChildren_455.findContentChildren(g,s));
    }

    @Test
    public void test1(){
        int[] g = {1,2};
        int[] s = {1,2,3};
        assertEquals(2,FindContentChildren_455.findContentChildren(g,s));
    }
}

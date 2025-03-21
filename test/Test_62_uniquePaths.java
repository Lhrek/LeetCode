import org.junit.Test;
import static org.junit.Assert.*;

public class Test_62_uniquePaths {
    @Test
    public void test()
    {
        int m = 3; int n =2;
        assertEquals(3, uniquePaths_62.uniquePaths(m,n));
    }

    @Test
    public void test1()
    {
        int m = 7; int n =3;
        assertEquals(28, uniquePaths_62.uniquePaths(m,n));
    }

}

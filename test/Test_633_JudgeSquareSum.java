import org.junit.Test;
import static org.junit.Assert.*;
public class Test_633_JudgeSquareSum {
    @Test
    public void test(){
        int num = 2147483600;
        assertEquals(true,JudgeSquareSum_633.judgeSquareSum(num));
    }
}

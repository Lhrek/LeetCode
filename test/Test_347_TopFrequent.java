import org.junit.Test;
import static org.junit.Assert.*;

public class Test_347_TopFrequent {
    @Test
    public void testGeneral(){
        int nums[] = {1,1,1,2,2,3};
        int exp[] = {1,2};
        assertArrayEquals(exp,TopKFrequent_347.topKFrequent(nums,2));
    }

    @Test
    public void testSingle(){
        int nums[] = {1};
        int exp[] = {1};
        assertArrayEquals(exp,TopKFrequent_347.topKFrequent(nums,1));
    }

    @Test
    public void testTwo(){
        int nums[] = {1,2};
        int exp[] = {1,2};
        assertArrayEquals(exp,TopKFrequent_347.topKFrequent(nums,2));
    }
}

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Test_78_subsets {
    @Test
    public void test()
    {
        subsets_78 s78 = new subsets_78();
        int[] nums = {1,2,3};
        List<List<Integer>> expected = List.of(
                List.of(),
                List.of(1),
                List.of(2),
                List.of(1, 2),
                List.of(3),
                List.of(1, 3),
                List.of(2, 3),
                List.of(1, 2, 3)
        );
        assertEquals(expected, subsets_78.subsets(nums));
    }
}

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Test_118_generate {
    @Test
    public void test() {
        List<List<Integer>> expected = List.of(
                List.of(1),
                List.of(1, 1),
                List.of(1, 2, 1),
                List.of(1, 3, 3, 1),
                List.of(1, 4, 6, 4, 1)
        );
        assertEquals(expected, generate_118.generate(5));
    }

    @Test
    public void test1() {
        List<List<Integer>> expected = List.of(
                List.of(1),
                List.of(1, 1),
                List.of(1, 2, 1),
                List.of(1, 3, 3, 1),
                List.of(1, 4, 6, 4, 1),
                List.of(1, 5, 10, 10, 5, 1),
                List.of(1, 6, 15, 20, 15, 6, 1)
        );

        assertEquals(expected, generate_118.generate(7));
    }
}

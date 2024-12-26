import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Test_49_GroupAnagrams {
    @Test
    public void test() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat"};
        List<List<String>> res = new ArrayList<>(
                Arrays.asList(
                        new ArrayList<>(Arrays.asList("nat", "tan")),
                        new ArrayList<>(Arrays.asList("ate", "eat", "tea"))
                )
        );
        assertEquals(res, GroupAnagrams_49.groupAnagrams(strs));
    }

    @Test
    public void testNull() {
        String[] strs = {""};
        List<List<String>> res = new ArrayList<List<String>>();
        assertEquals(res, GroupAnagrams_49.groupAnagrams(strs));
    }

    @Test
    public void testSingle() {
        String[] strs = {"a"};
        List<List<String>> res = Arrays.asList(
                Arrays.asList("a")
        );
        assertEquals(res, GroupAnagrams_49.groupAnagrams(strs));
    }

}

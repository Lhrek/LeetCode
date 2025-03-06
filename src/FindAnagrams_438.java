import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAnagrams_438 {
    //暴力 所谓异位词就是字符组成一样，收集字符出现数，存在大小为26的数组中，以此数组作为哈希
    //暴力改进 每次滑动 不用重新计算s_hash,从前一个s_hash中减去一个字符，加上一个字符。第一个s_hash要单独构建
//    public static List<Integer> findAnagrams(String s, String p) {
//        List<Integer> ans = new ArrayList<>();
//        int[] p_hash = new int[26];
//        for (int i = 0; i < p.length(); i++) {
//            p_hash[p.charAt(i) - 'a']++;
//        }
//        for (int i = 0; i < s.length() - p.length() + 1; i++) {
//            int[] s_hash = new int[26];
//            for (int j = 0; j < p.length(); j++) {
//                s_hash[s.charAt(i + j) - 'a']++;
//            }
//            if (Arrays.equals(p_hash, s_hash)) {
//                ans.add(i);
//            }
//        }
//        return ans;
//    }

    /* 可变滑动窗口
   1、cnt数组：统计p中各字符需求数量（正数表示需要该字符，负数为冗余）
   2、右指针扩张：每次右移时消耗当前字符（cnt--），若导致该字符变为负值，说明窗口存在非法字符
   3、左指针收缩：通过左移恢复被过度消耗的字符，直至当前字符计数合法（≥0）
   4、窗口验证：当窗口长度等于p长度时，说明此时所有字符刚好满足p的需求量（cnt全为0），记录左端点
   */

    public static List<Integer>  findAnagrams(String s, String p) {
        //todo
        List<Integer> ans = new ArrayList<>();
        int[] cnt = new int[26]; // 统计 p 的每种字母的出现次数
        for (char c : p.toCharArray()) {
            cnt[c - 'a']++;
        }
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            int c = s.charAt(right) - 'a'; // 当前字母的索引
            cnt[c]--; // 右端点字母进入窗口,消除一个
            while (cnt[c] < 0) { // 字母 c 太多了
                cnt[s.charAt(left) - 'a']++; // 左端点字母离开窗口
                left++;
            }
            /*while循环过后，窗口中字母数肯定是小于等于cnt的(因为为了消除一个新增的右边界字母，左窗口右移减少了很多其他字母)
             当等于的情况出现时，就是异位词*/
            if (right - left + 1 == p.length()) { // s' 和 p 的每种字母的出现次数都相同
                ans.add(left); // s' 左端点下标加入答案
            }
        }
        return ans;
    }


}

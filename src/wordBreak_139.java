import java.util.HashSet;
import java.util.List;
import java.util.Set;
/*
状态定义
定义 dp[i] 表示字符串 s 的前 i 个字符（即 s.substring(0, i)）是否可以被拆分成字典中的单词。
状态转移
对于每个位置 i，遍历所有可能的分割点 j（0 ≤ j < i）：
如果 dp[j] 为 true，且子串 s.substring(j, i) 存在于字典中，则 dp[i] = true。
*/

public class wordBreak_139 {
    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> hashWord = new HashSet<>(wordDict);
        int length = s.length();
        boolean[] dp = new boolean[length + 1];
        dp[0] = true;

        for (int i = 1; i < length + 1; i++) {
            for (int j = 0; j < length; j++) {
                if (dp[j] && hashWord.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[length];
    }
}

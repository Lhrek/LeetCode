import java.util.Arrays;

public class lengthOfLIS_300 {
    public static int lengthOfLIS(int[] nums) {
        //dp[i] = Max(dp[i-1],dp[j]+1) dp[i]->以nums[i]结尾的最长子序列长度
        int length = nums.length;
        int[] dp = new int[length];
        Arrays.fill(dp, 1);
        int res = 1;
        for (int i = 0; i < length; i++) {
            int maxLen = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    maxLen = Math.max(maxLen, dp[j] + 1);
                }
            }
            dp[i] = maxLen;
            //每次得到以nums[i]结尾的序列结果 更新res
            res = Math.max(res,maxLen);
        }
        return res;
    }
}

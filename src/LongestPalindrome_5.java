public class LongestPalindrome_5 {
    public static String longestPalindrome(String s) {
        //1、动态规划dp[i][j]代表下标为ij的子串是否为回文 j>=i
        //2、马拉车 先预处理，将原字符串各个字符中加入一个我们设定的特定字符，然后。。。。
        int maxLen = 1;
        int res_lef = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
            if (i < s.length() - 1) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    dp[i][i + 1] = true;
                    maxLen = 2;
                    res_lef = i;
                }
            }
        }

            for (int m =  2; m < s.length(); m++) {
                int i =0;int j = m;
                while (j < s.length()){
                    if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                        dp[i][j] = true;
                        if (j - i + 1 > maxLen) {
                            maxLen = j - i + 1;
                            res_lef = i;
                        }
                    }
                    i++;
                    j++;
                }

            }

        return s.substring(res_lef,res_lef+maxLen);

    }
}

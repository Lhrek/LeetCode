public class LongestPalindrome_5 {
    public static String longestPalindrome(String s) {
        //todo
        //1、动态规划dp[i][j]代表下标为ij的子串是否为回文
        //2、马拉车 先预处理，将原字符串各个字符中加入一个我们设定的特定字符，然后。。。。
        int length = s.length();
        boolean[][] dp = new boolean[length][length];
        for (int i = 0; i < length; i++) {
            dp[i][i] = true;
        }
        for(int i=0;i<length-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                dp[i][i+1] = true;
            }
        }

        for (int i = 1; i < length - 1; i++) {
            int left = i - 1;
            int right = 2 * i - left;
            while (left > -1 && right < length) {
                if (s.charAt(left) == s.charAt(right) && dp[left + 1][right - 1])
                    dp[left][right] = true;
                else
                    dp[left][right] = false;
                left--;
                right++;
            }

            int left_ = left;
            int right_ = right + 1;
            while (left_ > -1 && right_ < length) {
                if (s.charAt(left_) == s.charAt(right_) && dp[left_ + 1][right_ - 1])
                    dp[left_][right_] = true;
                else
                    dp[left_][right_] = false;
                left_--;
                right_++;
            }
        }

        int max_len = -1;
        int res_left = -1;
        int res_right = -1;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (dp[i][j]) {
                    max_len = Math.max(max_len, j - i);
                    res_left = i;
                    res_right = j;
                }
            }
        }
        return s.substring(res_left,res_right+1);


    }
}

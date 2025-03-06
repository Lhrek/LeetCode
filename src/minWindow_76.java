public class minWindow_76 {
    public static String minWindow(String s, String t) {
        //迭代右边界，寻找右边界中符合条件的最小子串
        //不断右移左边界的时候 如何判断其是覆盖子串？
        //暴力 用128位数组表示一个子串
        if(t.length() > s.length() )
            return "";

        int[] cnt = new int[128]; //题目大小写敏感，直接用ASCII映射，ASCII有128个 包含大小写字母
        for (int i = 0; i < t.length(); i++) {
            cnt[t.charAt(i)]++;
        }

        int minWin = Integer.MAX_VALUE;
        boolean change = false;
        int left_ans = 0;
        int right_ans = 0;
        for (int i = t.length() - 1; i < s.length(); i++) {
            //left ~ i 为处理的子串
            for (int left = 0; left <= i - t.length() + 1; left++) {
                if (contain(s.substring(left, i + 1), cnt)) {
                    if (i - left + 1 < minWin) {
                        minWin = i - left + 1;
                        left_ans = left;
                        right_ans = i;
                        change = true;
                    }
                }
//                break;
            }

        }
        if(change)
            return s.substring(left_ans, right_ans + 1);
        else
            return "";
    }

    public static boolean contain(String substr, int[] cnt) {
        int[] sub_cnt = new int[128];
        for (int i = 0; i < substr.length(); i++) {
            sub_cnt[substr.charAt(i)]++;
        }
        for (int i = 0; i < 128; i++) {
            if (sub_cnt[i] < cnt[i]) {
                return false;
            }
        }
        return true;
    }


    //todo 暴力第一层优化 contain可以用上一次的结果
}



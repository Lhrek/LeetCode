import java.util.LinkedList;
import java.util.Queue;

public class coinChange_322 {
    //    public static int coinChange(int[] coins, int amount) {
//        //BFS 超时
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(0);
//        int ans = 0;
//        while (true) {
//            int levelSize = queue.size();
//            boolean isAble = false;
//            for (int i = 0; i < levelSize; i++) {//对应每一次步兑换
//                int cur = queue.poll();
//                if (cur == amount)
//                    return ans;
//                if (cur < amount)
//                    isAble = true;
//                for (int coin : coins) {
//                    queue.add(cur + coin);
//                }
//                if (!isAble) {
//                    return -1;
//                }
//            }
//            ans++;
//        }
//    }
    public static int coinChange(int[] coins, int amount) {
        //dp[i] = min(dp[i-cons[[0]],dp[i-cons[[1]],dp[i-cons[[2]],...... )+1
        int[] dp = new int[amount + 1];
        dp[0] = 0;
//        for(int coin:coins){
//            dp[coin] = 1;
//        }
        for (int i = 1; i < amount+1; i++) {
           int min = Integer.MAX_VALUE;
           for(int coin : coins){
               if(i>=coin && dp[i-coin]   < min - 1){
                   min = dp[i-coin] + 1;
               }
           }
           dp[i] = min;
        }
        return dp[amount] == Integer.MAX_VALUE? -1:dp[amount];

    }

}

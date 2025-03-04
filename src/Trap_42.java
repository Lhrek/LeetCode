public class Trap_42 {
    //    public static int trap(int[] height) { //暴力 超时
//        int ans = 0;
//        for (int i = 0; i < height.length; i++) {
//            int left_max = -1;
//            int right_max = -1;
//            //向左找最高点
//            for (int j = 0; j < i; j++) {
//                left_max = Math.max(left_max, height[j]);
//            }
//            //向右找最高点
//            for (int k = i + 1; k < height.length; k++) {
//                right_max = Math.max(right_max, height[k]);
//            }
//            //min(left_max,right_max) - height
//            if (Math.min(left_max, right_max) - height[i] > 0) {
//                ans += Math.min(left_max, right_max) - height[i];
//            }
//        }
//
//        return ans;
//    }
    public static int trap(int[] height) {
        int ans = 0;
        int length = height.length;
        //dp 使用记忆 一次扫描将左右最大值保存起来
        int[] left_max = new int[length];
        int[] right_max = new int[length];
        for (int i = 1; i < length; i++) {
            left_max[i] = Math.max(left_max[i - 1], height[i - 1]); //每次迭代 只要利用之前的结果，比较当前值和之前的最大值就行
        }
        for (int i = length - 2; i > 0; i--) {
            right_max[i] = Math.max(right_max[i + 1], height[i + 1]);
        }

        for (int i = 0; i < length; i++) {
            if (Math.min(left_max[i], right_max[i]) - height[i] > 0) {
                ans += Math.min(left_max[i], right_max[i]) - height[i];
            }
        }

        return ans;

    }


}

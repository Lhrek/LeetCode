public class MaxSlidingWindow_239 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int res[] = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length - k + 1; i++) {
            if (i == 0) {
                int current_max = Integer.MIN_VALUE;
                for (int j = 0; j < k; j++) {
                    if(nums[j] > current_max)
                        current_max = nums[j];
                }
                res[0] = current_max;
                continue;
            }else {
                //如果最左边滑走的不是最大的，只要比较bef_max 和 最右边新加入的
                //如果左边滑走的是最大的 从头开始扫描
                int bef_max = res[i-1];
                int current_max = Integer.MIN_VALUE;
                if(bef_max == nums[i-1]){
                    for(int j = i;j<i+k;j++){
                        if(nums[j] > current_max)
                            current_max = nums[j];
                    }
                }else {
                    current_max = Integer.max(bef_max,nums[i+k-1]);
                }
                res[i] = current_max;
            }
        }

        return res;
    }
}

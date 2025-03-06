public class productExceptSelf_238 {
    //扫描两边 分别记录元素左边元素的乘积 和 右边元素的乘积
    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int right_product = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0)
                ans[i] = 1;
            else
                ans[i] = ans[i - 1] * nums[i - 1];
        }
        for (int j = nums.length - 1; j >= 0; j--) {
            ans[j] = right_product * ans[j];
            right_product *= nums[j];
        }
        return ans;
    }
}

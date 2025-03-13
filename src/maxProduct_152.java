public class maxProduct_152 {
    public static int maxProduct(int[] nums) {
        //imax[i] 以nums[i]结束的子串乘积的最大值 imin(i) 以xxx的最小值
        // 由于存在负数，那么会导致最大的变最小的，最小的变最大的。因此还需要维护当前最小值imin
        int length = nums.length;
        //nums[i] >=0 imax[i] = Max(nums[i]*imax[i-1],nums[i])
        //nums[i] <0 imax[i] = Max(nums[i]*imin[i-1],nums[i])
        int[] imax = new int[length];
        //nums[i] >=0 imin[i] = Min(nums[i]*imin[..],..)
        //        <0 xx         Min(xxx*imax[..]....)
        int[] iMax = new int[length];
        int[] iMin = new int[length];
        iMax[0] = nums[0];iMin[0] = nums[0];

        int res = nums[0];
        for (int i = 1; i < length; i++) {
            if(nums[i] >=0 ){
                iMax[i] = Math.max(nums[i]*iMax[i-1],nums[i]);
                iMin[i] = Math.min(nums[i]*iMin[i-1],nums[i]);
            }else {
                iMax[i] = Math.max(nums[i]*iMin[i-1],nums[i]);
                iMin[i] = Math.min(nums[i]*iMax[i-1],nums[i]);
            }
            res = Math.max(res,iMax[i]);
        }
        return res;
    }
}

public class MaxArea_11 {
    public static int maxArea(int[] height){
        /*从暴力的基础上如何剪枝
        * 双指针分别在最左和最右边，小的那条边向中间移动，更新当前最大面积，直到扫描结束
        * 如果移动长的那边的话得到的结果肯定不会比当前更好，因为上限固定是短的那边乘指针间隔，指针间隔还在变小，所以
        * 移动短的那边(锁死上线的那边)以期望找到一个足够高的变抵消指针间隔缩小带来的影响
        * */
        int left = 0;
        int right = height.length-1;
        int max_area = -1;
        while( left != right){
            max_area = Math.max( max_area,(Math.min(height[left],height[right]))*(right-left) );
            if(height[left] < height[right] ){
                left++;
            }else {
                right --;
            }
        }
        return max_area;
    }
}
